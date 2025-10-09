package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

@Entity

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
  // Foreign key column of Tray
  @ManyToOne // this mean many parts can be in one tray
  @JoinColumn(name = "tray_id", nullable = false)
  // the id of tray_id is possible to be repeated in this table
  private Tray tray;
  @ManyToOne //FK to PartType
  @JoinColumn(name = "part_type_id", nullable = false)
  private PartType partType;

  public Part(Animal animal, double weight, Tray tray, PartType partType)
  {
    this.animal = animal;
    this.weight = weight;
    this.tray = tray;
    setPartType(partType);
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


    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public PartType getPartType()
    {
        return partType;
    }

    public void setPartType(PartType partType)
    {
        this.partType = partType;
    }


}
