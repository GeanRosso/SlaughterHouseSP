package grpc.slaughterhouseService;

import grpc.slaughterhouseService.generate.StationOneServiceGrpc;
import grpc.slaughterhouseService.generate.registerAnimalRequest;
import grpc.slaughterhouseService.generate.registerAnimalResponse;
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
        StationOneServiceGrpc.StationOneServiceBlockingStub stub = StationOneServiceGrpc.newBlockingStub(channel);
        registerAnimalRequest registerAnimalRequest = grpc.slaughterhouseService.generate.
                registerAnimalRequest.newBuilder().setAnimalTypeId(1).setWeight(696).build();
        StationOneServiceGrpc.StationOneServiceBlockingStub blockingStub = StationOneServiceGrpc.newBlockingStub(channel);
        registerAnimalResponse response = blockingStub.registerAnimal(registerAnimalRequest);
        System.out.println("Received response: " + response.getAnimal());

    }
}
