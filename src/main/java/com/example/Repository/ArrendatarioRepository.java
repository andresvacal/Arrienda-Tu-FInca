package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Arrendatario;


public interface ArrendatarioRepository  extends JpaRepository<Arrendatario, Long>{

    Optional <Arrendatario> findByIdArrendatario(Long idArrendatario);

    Optional <Arrendatario> findBycorreoElectronico(String correoElectronico);
}
