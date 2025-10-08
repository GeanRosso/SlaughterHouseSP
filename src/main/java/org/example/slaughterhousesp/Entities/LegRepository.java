package org.example.slaughterhousesp.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LegRepository extends JpaRepository<Leg, Integer>
{
  List<Leg> findByAnimal_AnimalId(int animalId);
}
