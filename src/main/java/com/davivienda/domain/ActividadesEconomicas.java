package com.davivienda.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ActividadesEconomicas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idActividadEconomica;

    private String descripcion;

}
