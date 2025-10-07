package Entities;

import java.util.ArrayList;
import java.util.List;

public class StationTwo
{
  private double headPrt, gutsPrtm, legPrt;
  private  int trayMaxWeight;
  private int trayCounter = 1;

  public StationTwo(double headPrt, double gutsPrtm, double legPrt, int trayMaxWeight){
    double sum =  headPrt + gutsPrtm + legPrt;
    this.headPrt = headPrt;
    this.gutsPrtm = gutsPrtm;
    this.legPrt = legPrt;
    this.trayMaxWeight = trayMaxWeight;
  }
  public StationTwo()
  {
    this(0.10,0.15,0.25,5000); // static valuess
  }
public void cut(Animal animal)
{
  int total = animal.getWeight();
  int headW = (int) Math.round(total*headPrt);
  int gutsW = (int) Math.round(total*gutsPrtm);
  int legW = (int) Math.round(total*legPrt);
  int meatW = total-(headW+gutsW+legW);

  animal.setHead(new Head(animal,headW));
  animal.setLeg(new Leg(animal, legW));
  animal.getGuts();
  animal.getMeat();
}
public List<Tray> packIntoTrays(Animal animal)
{
  List<Tray> trays =  new ArrayList<>();
  Tray headTray = new Tray(trayCounter++, trayMaxWeight, "HEAD");
  headTray.addPart(animal.getHead());
  trays.add(headTray);

  Tray legTray = new Tray(trayCounter++, trayMaxWeight, "LEG");
  legTray.addPart(animal.getLeg());
  trays.add(legTray);

  Tray gutsTray = new Tray(trayCounter++, trayMaxWeight, "GUTS");
  gutsTray.addPart(animal.getGuts());
  trays.add(gutsTray);

  Tray meatTray = new Tray(trayCounter++, trayMaxWeight, "MEAT");
  meatTray.addPart(animal.getMeat());
  trays.add(meatTray);

  return trays;
}

}
