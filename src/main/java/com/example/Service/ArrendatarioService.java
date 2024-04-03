package com.example.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.FormularioRepository;
@Service
public class ArrendatarioService {

    private final ArrendatarioRepository arrendatarioRepository;
    
    @Autowired
    public ArrendatarioService(ArrendatarioRepository arrendatarioRepository) {
        this.arrendatarioRepository = arrendatarioRepository;
    }
}
