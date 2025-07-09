package com.davivienda.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormaPago;

    private String descripcion;

}
