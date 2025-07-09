package com.davivienda.infrastructure.controller;

import com.davivienda.domain.Persona;
import com.davivienda.domain.Solicitud;
import com.davivienda.infrastructure.persistence.PersonaRepository;
import com.davivienda.infrastructure.persistence.SolicitudRepository;
import com.davivienda.services.PersonaService;
import com.davivienda.services.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class MainController {

    @Autowired
    private  PersonaService personaService;

    @Autowired
    private SolicitudService solicitudService;



    @GetMapping("/cliente")
    public List<Persona> getPersonas() {
        return personaService.getPersonas();
    }

    @GetMapping("/cliente/{id}")
    public Persona getPersona(@PathVariable Integer id) {
        return personaService.getById(id);
    }

    @PostMapping("/cliente")
    public Persona createPersona(@RequestBody Persona persona) {
        return personaService.create(persona);
    }

    @PutMapping("/cliente")
    public Persona updatePersona(@RequestBody Persona persona) {
        return personaService.create(persona);
    }

    @PostMapping("/solicitud")
    public Solicitud createSolicitud(@RequestBody Solicitud solicitud) {
        return solicitudService.createSolicitud(solicitud);
    }

    @PutMapping("/solicitud")
    public Solicitud updateSolicitud(@RequestBody Solicitud solicitud) {
        return solicitudService.updateSolicitud(solicitud);
    }

    @GetMapping("/solicitud/{id}")
    public Solicitud getSolicitud(@PathVariable Integer id) {
        return solicitudService.getSolicitud(id);
    }

    @PostMapping("/consultarInfoPersona/{id}")
    public Persona consultarInfo(@PathVariable Integer id) {
        return personaService.getById(id);
    }

    @GetMapping("/cliente/{id}/solicitudes")
    public List<Solicitud> getSolicitudesPorPersona(@PathVariable Integer id) {
        return solicitudService.getSolicitudesPorPersona(id);
    }
}
