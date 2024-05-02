package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Arrendador;

public interface ArrendadorRepository extends JpaRepository<Arrendador, Long>{

    Arrendador findByIdArrendador(Long idArrendador);

    Optional <Arrendador> findBycorreoElectronico(String correoElectronico);

}
