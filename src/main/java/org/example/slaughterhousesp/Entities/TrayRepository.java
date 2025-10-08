package org.example.slaughterhousesp.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrayRepository extends JpaRepository<Tray, Integer>
{
    List<Tray> findById(int partId);
}
