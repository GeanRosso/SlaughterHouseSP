package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

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


    @Column (name = "is_alive", nullable = false)
    private boolean isAlive = true;


    @Column (name = "arrival_timestamp" , nullable = false)
    private LocalDate arrivalDate = LocalDate.now();

    @Column (name = "origin" , nullable = false)
    private String origin = "Unknown";

    public Animal(AnimalType animalType, double weight) {
        this.type = animalType;
        this.weight = weight;
    }

    public Animal(AnimalType animalType, double weight, String origin)
    {
        this.type = animalType;
        this.weight = weight;
        this.origin = origin;
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

    public boolean isAlive()
    {
        return isAlive;
    }

    public void setAlive(boolean alive)
    {
        isAlive = alive;
    }

    public LocalDate getArrivalDate()
    {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate)
    {
        this.arrivalDate = arrivalDate;
    }

    public String getOrigin()
    {
        return origin;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

}
