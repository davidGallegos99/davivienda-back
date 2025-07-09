package com.davivienda.domain;

import jakarta.persistence.*;

@Entity
public class EstadoCivil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadoCivil;

    private String descripcion;

    // Getters y setters
}
