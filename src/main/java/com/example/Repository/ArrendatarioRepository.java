package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
