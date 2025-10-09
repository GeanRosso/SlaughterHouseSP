package org.example.slaughterhousesp;

import org.example.slaughterhousesp.Entities.*;
import org.example.slaughterhousesp.Repositories.*;
import org.example.slaughterhousesp.Stations.StationOne;
import org.example.slaughterhousesp.Stations.StationThree;
import org.example.slaughterhousesp.Stations.StationTwo;
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
                                     StationThree stationThree,
                                     AnimalRepository animalRepository,
                                     MeatRepository meatRepository,
                                     HeadRepository headRepository,
                                     LegRepository legRepository,
                                     GutsRepository gutsRepository,
                                     TrayRepository trayRepository,
                                     AnimalTypeRepository animalTypeRepository,
                                     ProductRepository productRepository
    )
    {

    return args -> {
      System.out.println("=== Slaughterhouse simulation starting ===");

      AnimalType cowType = animalTypeRepository.findById(1).orElseThrow();
      Animal animal = new Animal(cowType, 1000);
         stationOne.registerAnimal(animal);
      System.out.println("Animal registered: " + animal);

        Animal givenAnimeFromDb = animalRepository.findById(1).orElseThrow(()-> new RuntimeException("Animal not found"));

        List<Part> parts = stationTwo.cut(givenAnimeFromDb);
        System.out.println("Animal cut into parts:");
        parts.forEach(System.out::println);

        Tray givenTrayFromDb = trayRepository.findById(3).orElseThrow(()-> new RuntimeException("Tray not found"));
        Product product = stationThree.packSingleProduct(givenTrayFromDb);
        System.out.println("Product packed: " + product);

      System.out.println("=== Simulation of REST finished successfully ===");
    };
  }
}
