package org.example.slaughterhousesp.Entities;

import jakarta.persistence.Column;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tray
{
  @Column(name = "maxWeight", nullable = false)
  private int maxWeight;
  @Column (name = "id", nullable = false)
  private int trayId;
  private String partType;
  private List<Part> parts = new ArrayList<>();
  private int currentWeight;

  public Tray(){}

  public Tray(int maxWeight, int trayId, String partType)
  {
    this.maxWeight = maxWeight;
    this.trayId = trayId;
    this.partType = partType;
  }

  public int getMaxWeight()
  {
    return maxWeight;
  }

  public int getTrayId()
  {
    return trayId;
  }

  public int getCurrentWeight()
  {
    return currentWeight;
  }

  public String getPartType()
  {
    return partType;
  }

  public List<Part> getParts()
  {
    return List.copyOf(parts);
  }

  public void addPart(Part part)
  {
    double weight = 0;
    if (part instanceof Head h && Objects.equals
        (getPartType(), h.getPartType()))
      weight = h.getWeight();
    else if (part instanceof Leg l && Objects.equals
        (getPartType(),l.getPartType()))
      weight = l.getWeight();
    else if (part instanceof Guts g && Objects.equals
        (getPartType(),g.getPartType()))
      weight = g.getWeight();
    else if (part instanceof Meat m && Objects.equals
        (getPartType(),m.getPartType()))
      weight = m.getWeight();
    if (currentWeight + weight > maxWeight)
      if (!part.getClass().getSimpleName().equalsIgnoreCase(partType))
        parts.add(part);
    currentWeight += weight;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Tray tray = (Tray) o;
    return maxWeight == tray.maxWeight && trayId == tray.trayId;
  }
}
