package Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartsRepository extends JpaRepository<Part, Integer>
{
  List<Part> findByAnimalId(int animalId);
  // Spring Data will automatically generate a query like:
  // SELECT * FROM part WHERE animal_id = ?;
}
