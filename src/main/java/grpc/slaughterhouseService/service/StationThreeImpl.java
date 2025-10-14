package grpc.slaughterhouseService.service;

import io.grpc.stub.StreamObserver;
import org.example.slaughterhousesp.Entities.Product;
import org.example.slaughterhousesp.Repositories.ProductRepository;
import org.example.slaughterhousesp.Repositories.TrayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterhouseService.*;

@Service
public class StationThreeImpl extends StationThreeServiceGrpc.StationThreeServiceImplBase
{
    // we need tray, and product repositories
    private TrayRepository trayRepository;
    private ProductRepository productRepository;

    @Autowired
    public StationThreeImpl(TrayRepository trayRepository, ProductRepository productRepository)
    {
        this.trayRepository = trayRepository;
        this.productRepository = productRepository;
    }


    public void packSingleProduct(packSingleProductRequest request,
                                  StreamObserver<PackSingleProductResponse> responseObserver)
    {
        // find tray in DB
        var tray = trayRepository.findById(request.getTrayId()).orElse(null);

        Product product = new Product(tray);
        assert tray != null; // for null safety
        product.setTotalWeight(tray.getPart().getWeight());
        // save the product to the database
        productRepository.save(product);
        // make dto for response
        slaughterhouseService.Product productDto = slaughterhouseService.Product.newBuilder()
                .setId(product.getId())
                .setTotalWeight(product.getTotalWeight())
                .setTrayId1(product.getTray().getId())
                .setTrayId2(-1) // no second tray
                .build();
        PackSingleProductResponse response = PackSingleProductResponse.newBuilder()
                .setProduct(productDto).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void packHalfAnimal(packHalfAnimalRequest request,
                                      StreamObserver<PackHalfAnimalResponse> responseObserver)
    {
        // find trays in DB
        var trayEntity1 = trayRepository.findById(request.getTrayId1()).orElse(null);
        var trayEntity2 = trayRepository.findById(request.getTrayId2()).orElse(null);
        assert trayEntity1 != null && trayEntity2 != null; // for null safety
        if (trayEntity1.getPart().getId() != trayEntity2.getPart().getId() && trayEntity1.getAnimal().getId() == trayEntity2.getAnimal().getId())
        {
            Product product = new Product(trayEntity1, trayEntity2);

            product.setTotalWeight(trayEntity1.getPart().getWeight() + trayEntity2.getPart().getWeight());
            // save the product to the database
            productRepository.save(product);
            // make dto for response
            slaughterhouseService.Product productDto = slaughterhouseService.Product.newBuilder()
                    .setId(product.getId())
                    .setTotalWeight(product.getTotalWeight())
                    .setTrayId1(product.getTray().getId())
                    .setTrayId2(product.getTray2().getId())
                    .build();
            PackHalfAnimalResponse response = PackHalfAnimalResponse.newBuilder()
                    .setProduct(productDto).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else
        {
            throw new IllegalArgumentException("Trays must contain parts from the same animal and different part types.");
        }

    }
}

