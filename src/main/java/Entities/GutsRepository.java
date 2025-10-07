package Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GutsRepository extends JpaRepository<Guts, Integer>
{
  List<Guts> findByAnimalId(int animalId);
}
