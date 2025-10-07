package Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer>
{
  // Find an animal by its type (optional)
  List<Animal> findByType(String type);

  // Find all animals heavier than a certain weight (optional)
  List<Animal> findByWeightGreaterThan(double weight);

  // Find all animals lighter than a certain weight (optional)
  List<Animal> findByWeightLessThan(double weight);


  //note
  /*
1. Extends JpaRepository<Animal, Integer>

  - Animal is your entity.

  - Integer is the type of the primary key (id).

2. Basic CRUD is included automatically

  - save(), findById(), findAll(), delete() — you don’t need to write these yourself.

3. Custom query methods

  - findByType(...) or findByWeightGreaterThan(...) are optional but useful for gRPC or StationTwo.

Spring Data JPA generates the SQL automatically.
   */
}
