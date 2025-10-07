package Entities;

import java.util.ArrayList;
import java.util.List;


public class Tray
{
  private int maxWeight;
  private int trayId;
  private String partType;
  private List<Object> parts = new ArrayList<>();
  private int currentWeight;

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

  public List<Object> getParts()
  {
    return List.copyOf(parts);
  }

  public void addPart(Object part)
  {
    int weight = 0;
    if (part instanceof Head h)
      weight = h.getWeight();
    else if (part instanceof Leg l)
      weight = l.getWeight();
    else if (part instanceof Guts g)
      weight = g.getWeight();
    else if (part instanceof Meat m)
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
