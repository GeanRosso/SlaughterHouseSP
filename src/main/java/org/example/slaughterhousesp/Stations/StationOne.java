package org.example.slaughterhousesp.Stations;

import org.example.slaughterhousesp.Repositories.AnimalRepository;
import org.example.slaughterhousesp.Entities.Animal;
import org.springframework.stereotype.Service;

@Service
public class StationOne
{
  private AnimalRepository animalRepo;

  public StationOne(AnimalRepository animalRepo)
  {
    this.animalRepo = animalRepo;
  }

  public void registerAnimal(Animal animal)
  {
    animalRepo.save(animal);
  }

}
