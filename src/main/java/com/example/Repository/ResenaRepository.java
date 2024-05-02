package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Resena;


public interface ResenaRepository extends JpaRepository<Resena, Long>{

   /*  Optional <Resena> findByidResena(Long idresena);*/
}
