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


          // statioon two - cut animal request
          cutRequest cutRequest1 = cutRequest.newBuilder().setAnimalId(1).build();
            StationTwoServiceGrpc.StationTwoServiceBlockingStub blockingStub2 =
                    StationTwoServiceGrpc.newBlockingStub(channel);
            CutResponse cutResponse = blockingStub2.cut(cutRequest1);
            System.out.println("Received response: " + cutResponse.getPartsList());
    }
}
