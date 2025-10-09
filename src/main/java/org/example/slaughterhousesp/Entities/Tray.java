package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Tray
{
    // rule to link with FK: @ManyToOne, and @JoinColumn. use association
  @Column(name = "maxweight", nullable = false)
  private double maxWeight;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private int id;
  @OneToMany(mappedBy = "tray", cascade = CascadeType.ALL) //which is the name of the attribute in Part class
  // this will not be in the database, it is just for us to easily access the parts in a tray
  // FK for Part column
  private List<Part> parts = new ArrayList<>();



    // Foreign key column of Animal
    @ManyToOne // this mean many parts can be from one animal
    @JoinColumn (name = "animal_id", nullable=false)
    private Animal animal; // the id of animal_id is possible to be repeated in this table


    // Foreign key column of Tray
    @ManyToOne // this mean many parts can be in one tray
    @JoinColumn(name = "part_id", nullable = true)
    private Part part; // the id of tray_id is possible to be repeated in this table
  private double currentWeight;

  public Tray(){}

    public Tray(double maxWeight, Animal animal, Part part)
    {
        this.maxWeight = maxWeight;
        this.animal = animal;
        this.part = part;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public Part getPart()
    {
        return part;
    }


  public double getMaxWeight()
  {
    return maxWeight;
  }

    public int getId()
    {
        return id;
    }

    public double getCurrentWeight()
  {
    return currentWeight;
  }


    public List<Part> getParts()
  {
    return List.copyOf(parts);
  }

    public void setPart(Part part)
    {
        this.part = part;
    }

    public void addPart(Part part)
  {
    double weight = 0;
    if (part instanceof Head h)
      weight = h.getWeight();
    else if (part instanceof Leg l )
      weight = l.getWeight();
    else if (part instanceof Guts g)
      weight = g.getWeight();
    else if (part instanceof Meat m )
      weight = m.getWeight();
    if (currentWeight + weight > maxWeight)
        parts.add(part);
    currentWeight += weight;
  }


}
