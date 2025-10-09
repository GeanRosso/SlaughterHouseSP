package org.example.slaughterhousesp.Repositories;

import org.example.slaughterhousesp.Entities.Leg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LegRepository extends JpaRepository<Leg, Integer>
{
}
