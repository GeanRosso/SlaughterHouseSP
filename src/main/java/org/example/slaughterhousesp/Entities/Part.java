package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")

public class Part
{
  @Id @GeneratedValue (strategy=GenerationType.IDENTITY)
  private int id;
  @Column (name = "animal_id", nullable=false)
  private int animalId;
  @Column (name = "weight", nullable=false)
  private double weight;
  @Column (name = "type", nullable = false)
  private String partType;
  @Column (name = "tray_id", nullable = false)
  private int trayId;

  public Part(int animalId, double weight, String partType, int trayId){
    this.animalId = animalId;
    this.weight = weight;
    this.partType = partType;
    this.trayId = trayId;
  }

  public Part()
  {

  }

  public int getAnimalId()
  {
    return this.animalId;
  }

  public double getWeight()
  {
    return this.weight;
  }

  public String getPartType()
  {
    return this.partType;
  }

  @Override
  public String toString()
  {
    return partType + "{animalId=" + animalId + ", weight=" + weight + "}";
  }
}
