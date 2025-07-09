package com.davivienda.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_actividad_economica")
    private ActividadesEconomicas actividadEconomica;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_civil")
    private EstadoCivil estadoCivil;

}
