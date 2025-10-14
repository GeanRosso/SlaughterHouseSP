package grpc.slaughterhouseService.service;

import io.grpc.stub.StreamObserver;
import org.example.slaughterhousesp.Entities.Part;
import org.example.slaughterhousesp.Entities.Tray;
import org.example.slaughterhousesp.Repositories.AnimalRepository;
import org.example.slaughterhousesp.Repositories.PartTypeRepository;
import org.example.slaughterhousesp.Repositories.PartsRepository;
import org.example.slaughterhousesp.Repositories.TrayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterhouseService.CutResponse;
import slaughterhouseService.StationTwoServiceGrpc;
import slaughterhouseService.cutRequest;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationTwoImpl extends StationTwoServiceGrpc.StationTwoServiceImplBase
{
    private AnimalRepository animalRepository;
    private TrayRepository trayRepository;
    private PartsRepository partsRepository;
    private PartTypeRepository partTypeRepository;

    private double headWeightPercent, gutsWeightPercent, legWeightPercent, meatWeightPercent;

    @Autowired
    public StationTwoImpl(AnimalRepository animalRepository, TrayRepository trayRepository,
                          PartsRepository partsRepository, PartTypeRepository partTypeRepository)
    {
        this.animalRepository = animalRepository;
        this.trayRepository = trayRepository;
        this.partsRepository = partsRepository;
        this.partTypeRepository = partTypeRepository;
    }


    public void cut(cutRequest request, StreamObserver<CutResponse> responseObserver)
    {
        // find animal in DB
        var animal = animalRepository.findById(request.getAnimalId()).orElse(null);
        if (animal == null)
        {
            System.out.println("Animal with ID " + request.getAnimalId() + " not found.");
            // throw error to client with .onError()
            responseObserver.onError(new Throwable("Animal not found"));
        }
        // cut animal
        // unalive it
        else
        {
            animal.setAlive(false);
            // update it in DB
            animalRepository.save(animal);
        }
        // cut them into parts: for now everything is cut into 4 parts
        headWeightPercent = 0.10;
        gutsWeightPercent = 0.20;
        legWeightPercent = 0.30;
        meatWeightPercent = 1 - (headWeightPercent + gutsWeightPercent + legWeightPercent);
        assert animal != null;
        Part head = new Part(animal, animal.getWeight()*headWeightPercent, null
                , partTypeRepository.findById(1).orElseThrow());
        Part guts = new Part(animal, animal.getWeight()*gutsWeightPercent, null
                , partTypeRepository.findById(2).orElseThrow());
        Part leg = new Part(animal, animal.getWeight()*legWeightPercent, null
                , partTypeRepository.findById(3).orElseThrow());
        Part meat = new Part(animal, animal.getWeight()*meatWeightPercent, null
                , partTypeRepository.findById(4).orElseThrow());

        List<Tray> trays = new ArrayList<>();
        for (int i = 0; i < 4; i++)
        {
            Tray tray = new Tray(animal.getWeight(), animal, null);
            trays.add(tray);
        }
        // save trays to DB first even it's null on part
        trayRepository.saveAll(trays);
        // put parts in trays
        head.setTray(trays.get(0));
        guts.setTray(trays.get(1));
        leg.setTray(trays.get(2));
        meat.setTray(trays.get(3));
        // save parts to DB
        partsRepository.save(head);
        partsRepository.save(guts);
        partsRepository.save(leg);
        partsRepository.save(meat);
        // set parts in trays
        trays.get(0).setPart(head);
        trays.get(1).setPart(guts);
        trays.get(2).setPart(leg);
        trays.get(3).setPart(meat);
        // update trays in DB
        trayRepository.saveAll(trays);


        // make dto for response
        // since we have repeated fields on cutResponse, we need to add parts one by one

        // create part response list
        List<slaughterhouseService.Part> partResponseList = new ArrayList<>();
        for (Tray tray : trays)
        {
            slaughterhouseService.Part partResponse = slaughterhouseService.Part.newBuilder()
                    .setId(tray.getPart().getId())
                    .setAnimalId(tray.getAnimal().getId())
                    .setWeight(tray.getPart().getWeight())
                    .setTrayId(tray.getId())
                    .setPartTypeId(tray.getPart().getId())
                    .build();
            partResponseList.add(partResponse);
        }
        CutResponse cutResponse = CutResponse.newBuilder().addAllParts(partResponseList).build();

        System.out.println("Cutting animal: " + request);
        responseObserver.onNext(cutResponse);
        responseObserver.onCompleted();
    }

}
