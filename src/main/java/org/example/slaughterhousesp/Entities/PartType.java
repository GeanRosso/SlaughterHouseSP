package org.example.slaughterhousesp.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "part_type")
public class PartType
{

    @Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String typeName;

    public PartType()
    {
    }

    public PartType(String typeName)
    {
        this.typeName = typeName;
    }

    public int getId()
    {
        return id;
    }


    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }
}
