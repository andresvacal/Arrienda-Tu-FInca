package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.formulario.Formulario;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Long>{

}
