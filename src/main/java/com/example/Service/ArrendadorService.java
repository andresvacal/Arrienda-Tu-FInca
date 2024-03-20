package com.example.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendadorRepository;
import com.example.Repository.FormularioRepository;
@Service
public class ArrendadorService {
    private final ArrendadorRepository arrendadorRepository;
    
    
    @Autowired
    public ArrendadorService(ArrendadorRepository arrendadorRepository) {
        this.arrendadorRepository = arrendadorRepository;
    }

}
