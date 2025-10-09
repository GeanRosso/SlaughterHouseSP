package grpc.slaughterhouseService.service;

import com.example.slaughterhouseService.*;
import io.grpc.stub.StreamObserver;
import org.example.slaughterhousesp.Entities.*;
import org.example.slaughterhousesp.Entities.Animal;
import org.example.slaughterhousesp.Entities.AnimalType;
import org.example.slaughterhousesp.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationOneImpl extends StationOneServiceGrpc.StationOneServiceImplBase
{
    private final AnimalRepository animalRepository;
    private final AnimalTypeRepository animalTypeRepository;

    @Autowired
    public StationOneImpl(AnimalRepository animalRepository, AnimalTypeRepository animalTypeRepository)
    {
        this.animalRepository = animalRepository;
        this.animalTypeRepository = animalTypeRepository;
    }


    public void registerAnimal(registerAnimalRequest request,
                               StreamObserver<registerAnimalResponse> responseObserver)
    {
        // make entity for DB
        AnimalType animalTypeEntity = animalTypeRepository.findById(request.getAnimalTypeId()).orElse(null);
        Animal animalEntity = new Animal(animalTypeEntity, request.getWeight());
        Animal saved = animalRepository.save(animalEntity);

        // make dto for response
        System.out.println("Registering animal: " + request);
        com.example.slaughterhouseService.Animal animalDto = com.example.slaughterhouseService.Animal.newBuilder()
                .setId(saved.getId())
                .setWeight(saved.getWeight())
                .setType(saved.getAnimalType().getName())
                .build();

        registerAnimalResponse response = registerAnimalResponse.newBuilder()
                .setAnimal(animalDto).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
