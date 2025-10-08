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
                                    AnimalRepository animalRepository,
                                    MeatRepository meatRepository,
                                     HeadRepository headRepository,
                                     LegRepository legRepository,
                                     GutsRepository gutsRepository,
                                     TrayRepository trayRepository)
    {

    return args -> {
      System.out.println("=== Slaughterhouse simulation starting ===");


     // Animal animal = new Animal("Cow", 1000);
        // stationOne.registerAnimal(animal);
      //System.out.println("Animal registered: " + animal);

        Animal givenAnimeFromDb = animalRepository.findById(1).orElseThrow(()-> new RuntimeException("Animal not found"));

        List<Part> parts = stationTwo.cut(givenAnimeFromDb);
        System.out.println("Animal cut into parts:");
        parts.forEach(System.out::println);

      System.out.println("=== Simulation stage 2 finished successfully ===");
    };
  }
}
