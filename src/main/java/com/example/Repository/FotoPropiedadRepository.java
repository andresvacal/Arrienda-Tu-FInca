package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.FotoPropiedad;

public interface FotoPropiedadRepository extends JpaRepository<FotoPropiedad, Long>{

    Optional <FotoPropiedad> findByIdFoto(Long idFoto);
    
}
