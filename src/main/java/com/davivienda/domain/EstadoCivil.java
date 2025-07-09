package com.davivienda.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EstadoCivil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadoCivil;

    private String descripcion;

}
