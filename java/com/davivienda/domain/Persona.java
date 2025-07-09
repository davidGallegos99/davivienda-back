package com.davivienda.domain;

import jakarta.persistence.*;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    private String dui;
    private String nit;
    private String nombres;
    private String apellidos;
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "idActividadEconomica")
    private ActividadesEconomicas actividadEconomica;

    @ManyToOne
    @JoinColumn(name = "idEstadoCivil")
    private EstadoCivil estadoCivil;

    // Getters y setters
}
