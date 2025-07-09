package com.davivienda.domain;

import jakarta.persistence.*;

@Entity
public class ActividadesEconomicas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idActividadEconomica;

    private String descripcion;

    // Getters y setters
}
