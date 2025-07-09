package com.davivienda.infrastructure.persistence;

import com.davivienda.domain.EstadoCivil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoCivilRepository extends JpaRepository<EstadoCivil, Integer> {
}
