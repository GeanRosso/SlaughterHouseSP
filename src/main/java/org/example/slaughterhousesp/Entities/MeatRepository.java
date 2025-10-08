package org.example.slaughterhousesp.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeatRepository extends JpaRepository<Meat, Integer>
{
  List<Meat> findByAnimalId(int animalId);
}
