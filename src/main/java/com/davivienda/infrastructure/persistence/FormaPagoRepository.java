package com.davivienda.infrastructure.persistence;

import com.davivienda.domain.FormaPago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagoRepository extends JpaRepository<FormaPago, Integer> {
}
