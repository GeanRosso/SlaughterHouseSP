package org.example.slaughterhousesp.Stations;

import org.example.slaughterhousesp.Entities.*;
import org.example.slaughterhousesp.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    private final PartsRepository partsRepository;
    private double headWeightPercent, gutsWeightPercent, legWeightPercent, meatWeightPercent;
  private int trayMaxWeight;
  private int trayCounter = 1;
  private HeadRepository headRepository;
  private GutsRepository gutsRepository;
  private LegRepository legRepository;
  private MeatRepository meatRepository;
  private TrayRepository trayRepository;
  private PartTypeRepository partTypeRepository;

    @Autowired
  public StationTwo(HeadRepository headRepository, GutsRepository gutsRepository
            , LegRepository legRepository, MeatRepository meatRepository
    , TrayRepository trayRepository, PartsRepository partsRepository,
                    PartTypeRepository partTypeRepository)
  {
  this.headRepository = headRepository;
  this.gutsRepository = gutsRepository;
  this.legRepository = legRepository;
  this.meatRepository = meatRepository;
  this.trayRepository = trayRepository;
      this.partsRepository = partsRepository;
      this.partTypeRepository = partTypeRepository;
  }




  // make default cut percentages
  public List<Part> cut(Animal animal)
  {
      headWeightPercent = 0.10;
      gutsWeightPercent = 0.20;
      legWeightPercent = 0.30;
      List<Tray> trays = new ArrayList<>();
      for (int i = 0; i < 4; i++)
      {
          Tray tray = new Tray(animal.getWeight()*1.5, animal, null);
          // make it null for now, will set part later
          trays.add(tray);
      }
      trayRepository.saveAll(trays); // insert trays to db first to get their ids
    double total = animal.getWeight();
    double headW = total * headWeightPercent;
    double gutsW = total * gutsWeightPercent;
    double legW = total * legWeightPercent;
    double meatW = total - (headW + gutsW + legW);
    PartType headPart = partTypeRepository.findById(1).orElseThrow();
    PartType gutsPart = partTypeRepository.findById(2).orElseThrow();
    PartType legPart = partTypeRepository.findById(3).orElseThrow();
    PartType meatPart = partTypeRepository.findById(4).orElseThrow();
    Head head = new Head(animal,headW, trays.get(0),headPart);
    Guts guts = new Guts(animal,gutsW, trays.get(1),gutsPart);
    Leg leg = new Leg(animal,legW, trays.get(2),legPart);
    Meat meat = new Meat(animal,meatW, trays.get(3),meatPart);

    head = partsRepository.save(head);
    guts = partsRepository.save(guts);
    leg = partsRepository.save(leg);
    meat = partsRepository.save(meat);

    // set part in tray since it's still null
      trays.get(0).setPart(head);
      trays.get(1).setPart(guts);
      trays.get(2).setPart(leg);
      trays.get(3).setPart(meat);
      trayRepository.saveAll(trays); // this is not insert, but update since trays already have ids

    return List.of(head,guts,leg,meat);
  }


  private String partType(Part p) {
    if (p instanceof Head) return "HEAD";
    if (p instanceof Leg)  return "LEG";
    if (p instanceof Guts) return "GUTS";
    if (p instanceof Meat) return "MEAT";
    throw new IllegalArgumentException("Unknown part class: " + p.getClass());
  }
  private int partWeight(Part p) {
    if (p instanceof Head h) return (int) h.getWeight();
    if (p instanceof Leg l)  return (int) l.getWeight();
    if (p instanceof Guts g) return (int) g.getWeight();
    if (p instanceof Meat m) return (int) m.getWeight();
    throw new IllegalArgumentException("Unknown part class: " + p.getClass());
}
}
