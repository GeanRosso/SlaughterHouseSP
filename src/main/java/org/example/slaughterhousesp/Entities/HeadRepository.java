package org.example.slaughterhousesp.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeadRepository extends JpaRepository<Head, Integer>
{
  List<Head> findByAnimal_AnimalId(int animalId);
}
