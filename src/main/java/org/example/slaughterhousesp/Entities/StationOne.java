package org.example.slaughterhousesp.Entities;

import org.springframework.stereotype.Service;

@Service
public class StationOne
{
  private final AnimalRepository animalRepo;

  public StationOne(AnimalRepository animalRepo)
  {
    this.animalRepo = animalRepo;
  }

  public void registerAnimal(Animal animal)
  {
    animalRepo.save(animal);
  }

}
