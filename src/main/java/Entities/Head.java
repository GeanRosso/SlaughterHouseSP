package Entities;

import java.util.Objects;

public class Head
{
  private Animal animal;
  private int weight;
  private int animalId;

  public Head(Animal animal, int weight)
  {
    this.animalId = animal.getAnimalId();
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
    return "Head{" + "animal=" + animal + ", weight=" + weight + '}';
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Head head = (Head) o;
    return weight == head.weight && Objects.equals(animal, head.animal);
  }
}
