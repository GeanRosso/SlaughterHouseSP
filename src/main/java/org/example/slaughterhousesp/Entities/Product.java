package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

import java.util.List;

//given that tray know animal and part via FK, use tray to pack the product
// therefore, we need key of those two as FK and total weight
@Entity
public class Product
{
    //PK
  @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
  private int id;
  // FK attribute, either single part of half animal (two individual parts), use id, with its table
    // will be
  @ManyToOne
  @JoinColumn(name = "tray_id_1", nullable = false)
  private Tray tray;

    @ManyToOne
  @JoinColumn(name = "tray_id_2", nullable = true)
  private Tray tray2; // for double part product, can be null for single part product

    @Column (name = "total_weight", nullable = false)
    private double totalWeight;

    //constructor with tray parameters (assign FK, PK assign by database automatically)
    // for single part product
    public Product(Tray tray)
    {
        setTray(tray);
        setTotalWeight(0);
    }

    public Product(Tray tray, Tray tray2)
    {
        setTray(tray);
        setTray2(tray2);
        setTotalWeight(0);
    }

    public Product()
    {
    }

    public int getId()
    {
        return id;
    }


    public Tray getTray()
    {
        return tray;
    }

    public double getTotalWeight()
    {
        return totalWeight;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTray(Tray tray)
    {
        this.tray = tray;
    }

    public void setTotalWeight(double totalWeight)
    {
        this.totalWeight = totalWeight;
    }

    public Tray getTray2()
    {
        return tray2;
    }

    public void setTray2(Tray tray2)
    {
        this.tray2 = tray2;
    }
}
