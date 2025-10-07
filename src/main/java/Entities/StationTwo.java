package Entities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
At the second station,the animals are cut into smaller parts.
Each part is weighed and registered, including a reference
to which animal it comes from.
The parts are put into trays with each tray containing only one type of parts.
Each tray has a maximum weight capacity
 */
@Service
public class StationTwo
{
  private double headWeight, gutsWeight, legWeight, meatWeight;
  private int trayMaxWeight;
  private int trayCounter = 1;
  private HeadRepository headRepository;
  private GutsRepository gutsRepository;
  private LegRepository legRepository;
  private MeatRepository meatRepository;

  public StationTwo(double headPrt, double gutsPrtm, double legPrt,
      int trayMaxWeight)
  {
    double sum = headPrt + gutsPrtm + legPrt;
    this.headWeight = headPrt;
    this.gutsWeight = gutsPrtm;
    this.legWeight = legPrt;
    this.trayMaxWeight = trayMaxWeight;
  }

  public StationTwo(HeadRepository headRepository, GutsRepository gutsRepository,LegRepository legRepository, MeatRepository meatRepository)
  {
  this.headRepository = headRepository;
  this.gutsRepository = gutsRepository;
  this.legRepository = legRepository;
  this.meatRepository = meatRepository;
  }

  public List<Object> cut(Animal animal)
  {
    int total = (int) animal.getWeight();
    int headW = (int) Math.round(total * headWeight);
    int gutsW = (int) Math.round(total * gutsWeight);
    int legW = (int) Math.round(total * legWeight);
    int meatW = total - (headW + gutsW + legW);
    Head head = new Head(animal.getAnimalId(),headW, 0);
    Guts guts = new Guts(animal.getAnimalId(),gutsW, 0);
    Leg leg = new Leg(animal.getAnimalId(),legW, 0);
    Meat meat = new Meat(animal.getAnimalId(),meatW, 0);
    head = headRepository.save(head);
    guts = gutsRepository.save(guts);
    leg = legRepository.save(leg);
    meat = meatRepository.save(meat);
    return List.of(head,guts,leg,meat);
  }

  public List<Tray> packIntoTrays(List<Animal> parts)
  {
    Map<String, List<Object>> byType = new HashMap<>();
    for (Object p : parts)
    {
      byType.computeIfAbsent(partType(p), k -> new ArrayList<>()).add(p);
    }
    List<Tray> trays = new ArrayList<>();
    for (Map.Entry<String, List<Object>> entry : byType.entrySet())
    {
      String type = entry.getKey();
      List<Object> group = entry.getValue();
      Tray tray = new Tray(trayCounter++, trayMaxWeight, type);
      for(Object p : group)
      {
        int w = partWeight(p);
        if (tray.getCurrentWeight() + w > tray.getMaxWeight()){
          trays.add(tray);
          tray = new Tray(trayCounter++, trayMaxWeight, type);
        }
      tray.addPart((Part) p);
      }
      if (!tray.getParts().isEmpty()) trays.add(tray);
    }
    return trays;
  }
  private String partType(Object p) {
    if (p instanceof Head) return "HEAD";
    if (p instanceof Leg)  return "LEG";
    if (p instanceof Guts) return "GUTS";
    if (p instanceof Meat) return "MEAT";
    throw new IllegalArgumentException("Unknown part class: " + p.getClass());
  }
  private int partWeight(Object p) {
    if (p instanceof Head h) return (int) h.getWeight();
    if (p instanceof Leg l)  return (int) l.getWeight();
    if (p instanceof Guts g) return (int) g.getWeight();
    if (p instanceof Meat m) return (int) m.getWeight();
    throw new IllegalArgumentException("Unknown part class: " + p.getClass());
}
}
