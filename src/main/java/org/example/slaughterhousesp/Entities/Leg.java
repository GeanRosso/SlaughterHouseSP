package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Leg extends Part
{
  public Leg(Animal animal, double weight, Tray tray, PartType partType)
  {
    super(animal, weight, tray, partType);
  }

    public Leg()
    {
        super();
    }
}
