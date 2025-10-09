package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Guts extends Part
{
   public Guts(Animal animal, double weight, Tray tray, PartType partType)
   {
     super(animal, weight,tray, partType);
   }

    public Guts()
    {
        super();
    }
}
