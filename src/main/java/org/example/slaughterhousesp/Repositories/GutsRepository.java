package org.example.slaughterhousesp.Repositories;

import org.example.slaughterhousesp.Entities.Guts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GutsRepository extends JpaRepository<Guts, Integer>
{
}
