package com.example.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.FormularioRepository;
import com.example.entity.Arrendatario;
@Service
public class ArrendatarioService {

    private final ArrendatarioRepository arrendatarioRepository;
    
    @Autowired
    public ArrendatarioService(ArrendatarioRepository arrendatarioRepository) {
        this.arrendatarioRepository = arrendatarioRepository;
    }
    public List<Arrendatario> getArrendatarios() {
        System.out.println("Mostrando arrendatarios " );
        return arrendatarioRepository.findAll();
    }
    public void saveArrendatario(Arrendatario arrendatario) {
        System.out.println("mi arrendatario es: " + arrendatario);
        arrendatarioRepository.save(arrendatario);
    }
}
