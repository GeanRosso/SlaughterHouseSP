package org.example.slaughterhousesp.Repositories;

import org.example.slaughterhousesp.Entities.Part;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartsRepository extends JpaRepository<Part, Integer>
{
  // Spring Data will automatically generate a query like:
  // SELECT * FROM part WHERE animal_id = ?;
}
