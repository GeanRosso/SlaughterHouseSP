package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")

public class Part
{
  @Id @GeneratedValue (strategy=GenerationType.IDENTITY)
  private int id;
  // Foreign key column of Animal
  @ManyToOne // this mean many parts can be from one animal
  @JoinColumn (name = "animal_id", nullable=false)
  // the id of animal_id is possible to be repeated in this table
  private Animal animal;
  @Column (name = "weight", nullable=false)
  private double weight;
  @Column (name = "part_type", nullable = false)
  private String partType;
  // Foreign key column of Tray
  @ManyToOne // this mean many parts can be in one tray
  @JoinColumn(name = "tray_id", nullable = false)
  // the id of tray_id is possible to be repeated in this table
  private Tray tray;

  public Part(Animal animal, double weight, String partType, Tray tray)
  {
    this.animal = animal;
    this.weight = weight;
    this.partType = partType;
    this.tray = tray;
  }

  public Part()
  {

  }

    public Tray getTray()
    {
        return tray;
    }

    public void setTray(Tray tray)
    {
        this.tray = tray;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public double getWeight()
  {
    return this.weight;
  }

    public void setPartType(String partType)
    {
        this.partType = partType;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getPartType()
  {
    return this.partType;
  }

}
