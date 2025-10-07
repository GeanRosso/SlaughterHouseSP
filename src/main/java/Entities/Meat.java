package Entities;

import java.util.Objects;

public class Meat
{
  private Animal animal;
  private int weight;
  private int animalId;

  public Meat(Animal animal, int weight)
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
    return "Meat{" + "animal=" + animal + ", weight=" + weight + '}';
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
   Meat meat = (Meat) o;
    return weight == meat.weight && Objects.equals(animal, meat.animal);
  }

}
