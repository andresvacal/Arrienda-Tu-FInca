package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Arrendatario;


public interface ArrendatarioRepository  extends JpaRepository<Arrendatario, Long>{

}
