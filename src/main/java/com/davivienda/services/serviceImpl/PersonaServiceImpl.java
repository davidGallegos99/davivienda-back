package com.davivienda.services.serviceImpl;

import com.davivienda.domain.Persona;
import com.davivienda.infrastructure.persistence.PersonaRepository;
import com.davivienda.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository repo;

    @Override
    public List<Persona> getPersonas() {
        return repo.findAll();
    }
    @Override
    public Persona getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Persona create(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public Persona consultarInfoPersona(Integer id) {
        return repo.findById(id).orElse(null);
    }
}
