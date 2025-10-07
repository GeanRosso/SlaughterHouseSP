package Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeadRepository extends JpaRepository<Head, Integer>
{
  List<Head> findByAnimalId(int animalId);
}
