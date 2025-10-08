package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Meat extends Part
{
  public Meat(Animal animal, double weight, Tray tray)
  {
    super(animal,weight,"Meat",tray);
  }

    public Meat()
    {
        super();
    }
}
