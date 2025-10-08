package org.example.slaughterhousesp;

import org.example.slaughterhousesp.Entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication public class SlaughterHouseSpApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(SlaughterHouseSpApplication.class, args);
  }
    @Bean
    CommandLineRunner testSimulation(StationOne stationOne,
      StationTwo stationTwo,
      StationThree stationThree) {
    return args -> {
      System.out.println("=== Slaughterhouse simulation starting ===");


      Animal animal = new Animal("Cow", 1000, 1); // id assigned later in DB
      System.out.println("Animal registered: " + animal);


      List<Part> parts = stationTwo.cut(animal);
      System.out.println("Animal cut into parts:");
      parts.forEach(System.out::println);


      List<Tray> trays = stationTwo.packIntoTrays(parts);
      System.out.println("Packed into trays:");
      trays.forEach(System.out::println);


      Product product = stationThree.packHalfAnimal(trays);
      System.out.println("Created product: " + product);

      System.out.println("=== Simulation finished successfully ===");
    };
  }
}
