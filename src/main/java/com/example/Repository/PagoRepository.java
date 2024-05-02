package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Arrendador;
import com.example.entity.Pago;

public interface PagoRepository extends JpaRepository<Pago, Long>{

    Optional <Pago> findByIdPago(Long idPago);
}
