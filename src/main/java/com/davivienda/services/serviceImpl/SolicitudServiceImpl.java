package com.davivienda.services.serviceImpl;

import com.davivienda.domain.Solicitud;
import com.davivienda.infrastructure.persistence.SolicitudRepository;
import com.davivienda.services.SolicitudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    private final SolicitudRepository solicitudRepo;

    public SolicitudServiceImpl(SolicitudRepository solicitudRepo) {
        this.solicitudRepo = solicitudRepo;
    }

    @Override
    public Solicitud createSolicitud(Solicitud solicitud) {
        return solicitudRepo.save(solicitud);
    }

    @Override
    public Solicitud updateSolicitud(Solicitud solicitud) {
        return solicitudRepo.save(solicitud);
    }

    @Override
    public Solicitud getSolicitud(Integer id) {
        return solicitudRepo.findById(id).orElse(null);
    }

    @Override
    public List<Solicitud> getSolicitudesPorPersona(Integer id) {
        return solicitudRepo.findByPersonaIdPersona(id);
    }
}