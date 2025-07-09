package com.davivienda.services;

import com.davivienda.domain.Solicitud;

import java.util.List;

public interface SolicitudService {

    Solicitud createSolicitud(Solicitud solicitud);
    Solicitud updateSolicitud(Solicitud solicitud);
    Solicitud getSolicitud(Integer id);
    List<Solicitud> getSolicitudesPorPersona(Integer id);
}
