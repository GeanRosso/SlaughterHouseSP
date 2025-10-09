package org.example.slaughterhousesp.Repositories;

import org.example.slaughterhousesp.Entities.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Integer>
{
}
