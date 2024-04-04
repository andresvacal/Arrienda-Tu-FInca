package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Propiedad;

public interface PropiedadRepository extends JpaRepository<Propiedad, Long>{

    Optional <Propiedad> findByIdPropiedad(Long idPropiedad);

}
