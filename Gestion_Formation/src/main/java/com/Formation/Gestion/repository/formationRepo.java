package com.Formation.Gestion.repository;

import com.Formation.Gestion.model.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface formationRepo extends JpaRepository<Formation, Long> {
}
