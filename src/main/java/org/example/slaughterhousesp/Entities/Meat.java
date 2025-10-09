package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Entity;


@Entity
public class Meat extends Part
{

  public Meat(Animal animal, double weight, Tray tray, PartType partType)
  {
    super(animal,weight,tray,partType);
  }

    public Meat()
    {
        super();
    }
}
