package com.davivienda.services;

import com.davivienda.domain.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> getPersonas();

    Persona getById(Integer id);

    Persona create(Persona persona);

    Persona update(Persona persona);

    Persona consultarInfoPersona(Integer id);
}