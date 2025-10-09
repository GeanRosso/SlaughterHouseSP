package org.example.slaughterhousesp.Repositories;

import org.example.slaughterhousesp.Entities.Meat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeatRepository extends JpaRepository<Meat, Integer>
{
}
