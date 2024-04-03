package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendadorRepository;
import com.example.entity.Arrendador;

@Service
public class ArrendadorService {
    private final ArrendadorRepository arrendadorRepository;
    
    
    @Autowired
    public ArrendadorService(ArrendadorRepository arrendadorRepository) {
        this.arrendadorRepository = arrendadorRepository;
    }

    public List<Arrendador> getArrendadores() {
        return arrendadorRepository.findAll();
    }
    public void saveArrendador(Arrendador arrendador) {
        System.out.println("mi arrendador es: " + arrendador);
        arrendadorRepository.save(arrendador);
    }

}
