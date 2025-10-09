package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

@Entity
public class AnimalType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name", nullable = false, unique = true)
    private String name;

    public AnimalType()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

}
