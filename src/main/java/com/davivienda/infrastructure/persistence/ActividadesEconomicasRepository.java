package com.davivienda.infrastructure.persistence;

import com.davivienda.domain.ActividadesEconomicas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActividadesEconomicasRepository extends JpaRepository<ActividadesEconomicas, Integer> {
}
