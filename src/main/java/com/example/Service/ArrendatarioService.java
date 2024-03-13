package com.example.Service;


import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.FormularioRepository;
@Service
public class ArrendatarioService {

    private final ArrendatarioRepository arrendatarioRepository;

    public ArrendatarioService(ArrendatarioRepository arrendatarioRepository) {
        this.arrendatarioRepository = arrendatarioRepository;
    }




}
