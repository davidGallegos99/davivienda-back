package com.davivienda.infrastructure.persistence;

import com.davivienda.domain.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
    List<Solicitud> findByPersonaIdPersona(Integer idPersona);
}
