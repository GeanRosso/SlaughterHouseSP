package Entities;

import java.util.Objects;

public class Leg extends Part
{
  public Leg(int animalId, double weight, int trayId)
  {
    super(animalId, weight, "Leg", trayId);
  }
}
