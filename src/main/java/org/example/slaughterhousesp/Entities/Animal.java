package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Animal
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int animalId;
  @Column (name = "type", nullable = false)
  private String type;
  @Column (name = "weight", nullable = false)
  private double weight;


    public Animal(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }


  public Animal()
  {

  }

  public int getAnimalId()
  {
    return animalId;
  }

  public void setAnimalId(int animalId)
  {
    this.animalId = animalId;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Animal animal = (Animal) o;
    return animalId == animal.animalId && weight == animal.weight
        && Objects.equals(type, animal.type);
  }
}
