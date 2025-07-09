package com.davivienda.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSolicitud;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    private Date fechaCreacion;
    private Double monto;
    private Integer plazo;

    @ManyToOne
    @JoinColumn(name = "idFormaPago")
    private FormaPago formaPago;

}
