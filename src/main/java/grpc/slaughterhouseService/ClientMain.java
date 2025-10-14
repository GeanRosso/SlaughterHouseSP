package grpc.slaughterhouseService;

import slaughterhouseService.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientMain
{
    public static void main(String[] args)
    {
        // Client code would go here
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 12345)
                .usePlaintext()
                .build();


//        // station one - register animal request
//        registerAnimalRequest registerAnimalRequest1 =
//                registerAnimalRequest.newBuilder().setAnimalTypeId(1).setWeight(696).build();
//        StationOneServiceGrpc.StationOneServiceBlockingStub blockingStub = StationOneServiceGrpc.newBlockingStub(channel);
//        registerAnimalResponse response = blockingStub.registerAnimal(registerAnimalRequest1);
//        System.out.println("Received response: " + response.getAnimal());


//          // station two - cut animal request
//          cutRequest cutRequest1 = cutRequest.newBuilder().setAnimalId(1).build();
//            StationTwoServiceGrpc.StationTwoServiceBlockingStub blockingStub2 =
//                    StationTwoServiceGrpc.newBlockingStub(channel);
//            CutResponse cutResponse = blockingStub2.cut(cutRequest1);
//            System.out.println("Received response: " + cutResponse.getPartsList());

//        // station three.1 - pack single product request
//        packSingleProductRequest packSingleProductRequest1 =
//                packSingleProductRequest.newBuilder().setTrayId(1).build();
//        StationThreeServiceGrpc.StationThreeServiceBlockingStub blockingStub3 =
//                StationThreeServiceGrpc.newBlockingStub(channel);
//        PackSingleProductResponse packSingleProductResponse = blockingStub3.packSingleProduct(packSingleProductRequest1);
//        System.out.println("Received response: " + packSingleProductResponse.getProduct());

        // station three.2 - pack half animal product request
        packHalfAnimalRequest packHalfAnimalRequest1 =
                packHalfAnimalRequest.newBuilder().setTrayId1(2).setTrayId2(3).build();
        StationThreeServiceGrpc.StationThreeServiceBlockingStub blockingStub4 =
                StationThreeServiceGrpc.newBlockingStub(channel);
        PackHalfAnimalResponse packHalfAnimalResponse = blockingStub4.packHalfAnimal(packHalfAnimalRequest1);
        System.out.println("Received response: " + packHalfAnimalResponse.getProduct());
    }
}
