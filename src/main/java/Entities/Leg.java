package Entities;

import java.util.Objects;

public class Leg
{
  private Animal animal;
  private int weight;
  private int animalId;

  public Leg(Animal animal, int weight)
  {
    this.animal = animal;
    this.weight = weight;

  }

  public Animal getAnimal()
  {
    return animal;
  }

  public void setAnimal(Animal animal)
  {
    this.animal = animal;
  }

  public int getWeight()
  {
    return weight;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }

  public String toString()
  {
    return "Leg{" + "animal=" + animal + ", weight=" + weight + '}';
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
   Leg leg = (Leg) o;
    return weight == leg.weight && Objects.equals(animal, leg.animal);
  }
}
