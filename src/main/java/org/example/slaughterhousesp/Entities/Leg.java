package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Leg extends Part
{
  public Leg(Animal animal, double weight, Tray tray)
  {
    super(animal, weight, "Leg", tray);
  }

    public Leg()
    {
        super();
    }
}
