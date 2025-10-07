package Entities;

public class Recall
{
  private String supPacking;
  private int animalId;
  private int weight;
  private String animalType;

  public Recall(String supPacking, int animalId, int weight, String animalType){
    this.supPacking = supPacking;
    this.animalId = animalId;
    this.weight = weight;
    this.animalType = animalType;
  }

  public String getSupPacking()
  {
    return supPacking;
  }

  public int getAnimalId()
  {
    return animalId;
  }

  public int getWeight()
  {
    return weight;
  }

  public String getAnimalType()
  {
    return animalType;
  }

  @Override public String toString()
  {
    return "StationOne{" + "animalId=" + animalId + ", weight=" + weight
        + ", animalType='" + animalType + '\'' + ", supPacking=" + supPacking
        + '}';
  }

}

