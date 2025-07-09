package com.davivienda.domain;

import jakarta.persistence.*;

@Entity
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormaPago;

    private String descripcion;

    // Getters y setters
}
