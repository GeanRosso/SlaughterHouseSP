package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Head extends Part
{

  public Head(Animal animal, double weight, Tray tray)
  {
    super(animal, weight, "Head", tray);
  }


    public Head()
    {
        super();
    }
}
