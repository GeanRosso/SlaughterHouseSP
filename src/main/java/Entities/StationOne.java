package Entities;

import java.util.ArrayList;
import java.util.Objects;

public class StationOne
{
  private int animalId;
  private int weight;
  private String animalType;

  private ArrayList<Animal> animals = new ArrayList<>();

  public StationOne(int weight, int animalId, String type)
  {
    this.animalId = animalId;
    this.weight = weight;
    this.animalType = type;
  }

  public void registerAnimal(Animal animal)
  {
    this.animals.add(animal);
  }

  public int getWeight()
  {
    return weight;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }

  public String getAnimalType()
  {
    return animalType;
  }

  public void setAnimalType(String animalType)
  {
    this.animalType = animalType;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    StationOne that = (StationOne) o;
    return animalId == that.animalId && weight == that.weight && Objects.equals(
        animalType, that.animalType)
        && Objects.equals(animals, that.animals);
  }

  @Override public String toString()
  {
    return "StationOne{" + "animalId=" + animalId + ", weight=" + weight
        + ", animalType='" + animalType + ", animals=" + animals + '}';
  }
}
