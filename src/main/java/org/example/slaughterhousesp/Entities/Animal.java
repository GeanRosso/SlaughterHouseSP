package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Animal
{
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column (name = "weight", nullable = false)
  private double weight;

    @ManyToOne @JoinColumn(name = "animal_type_id", nullable = false)
  private AnimalType type;


    public Animal(AnimalType animalType, double weight) {
        this.type = animalType;
        this.weight = weight;
    }


  public Animal()
  {

  }


    public void setType(AnimalType type)
    {
        this.type = type;
    }

    public AnimalType getAnimalType()
    {
        return type;
    }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }



}
