package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Repository.PropiedadRepository;
import com.example.entity.Propiedad;

@Service
public class PropiedadService {

    private final PropiedadRepository propiedadRepository;

    @Autowired
    public PropiedadService(PropiedadRepository propiedadRepository) {
        this.propiedadRepository = propiedadRepository;
    }


    public List<Propiedad> getPropiedades() {
        return propiedadRepository.findAll();
    }
    
    public void savepropiedad(Propiedad propiedad) {
        System.out.println("mi propiedad es: " + propiedad);
        propiedadRepository.save(propiedad);
    }

}


