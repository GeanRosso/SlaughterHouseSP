package Entities;

import java.util.Objects;
@Enteties
public class Animal
{
  private int animalId;
  private String type;
  private int weight;
  private Head head;
  private  Leg leg;
  private Guts guts;
  private Meat meat;

  public Animal(String type, int weight, int animalId, Head head, Leg leg, Guts guts, Meat meat)
  {
    this.animalId = animalId; //set this on StationOne later
    this.type = type;
    this.weight = weight;
    this.head = head;
    this.leg = leg;
    this.guts = guts;
    this.meat = meat;
  }

  public int getAnimalId()
  {
    return animalId;
  }

  public void setAnimalId(int animalId)
  {
    this.animalId = animalId;
  }

  public Meat getMeat()
  {
    return this.meat;
  }

  public void setMeat(Meat meat)
  {
    this.meat = meat;
  }

  public Guts getGuts()
  {
    return this.guts;
  }

  public void setGuts(Guts guts)
  {
    this.guts = guts;
  }

  public Leg getLeg()
  {
    return leg;
  }

  public void setLeg(Leg leg)
  {
    this.leg = leg;
  }

  public Head getHead()
  {
    return head;
  }

  public void setHead(Head head)
  {
    this.head = head;
  }

  public int getWeight()
  {
    return weight;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Animal animal = (Animal) o;
    return animalId == animal.animalId && weight == animal.weight
        && Objects.equals(type, animal.type) && Objects.equals(head,
        animal.head) && Objects.equals(leg, animal.leg) && Objects.equals(guts,
        animal.guts) && Objects.equals(meat, animal.meat);
  }
}
