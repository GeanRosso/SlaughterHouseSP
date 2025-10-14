package grpc.slaughterhouseService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import grpc.slaughterhouseService.service.*;
import org.example.slaughterhousesp.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.io.IOException;

@SpringBootApplication
@EntityScan("org.example.slaughterhousesp.Entities")
@EnableJpaRepositories("org.example.slaughterhousesp.Repositories")
public class ServerMain implements CommandLineRunner
{
    private StationOneImpl stationOne;
    private StationTwoImpl stationTwo;

    @Autowired
    public ServerMain(StationOneImpl stationOne, StationTwoImpl stationTwo)
    {
        this.stationOne = stationOne;
        this.stationTwo = stationTwo;
    }


    public static void main(String[] args)
    {
        SpringApplication.run(ServerMain.class, args);

    }

    @Override
    public void run(String... args) throws Exception
    {
        Server server = ServerBuilder
                .forPort(12345)
                .addService(stationOne)
                .addService(stationTwo)
                .build();
        server.start();
        System.out.println("Server started, listening on " + server.getPort());
        server.awaitTermination();
    }
}
