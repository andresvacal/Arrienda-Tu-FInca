package com.example.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.FotoPropiedadRepository;
import com.example.entity.FotoPropiedad;
@Service
public class FotoPropiedadService {
    private final FotoPropiedadRepository fotoPropiedadRepository;
    @Autowired
    public FotoPropiedadService(FotoPropiedadRepository fotoPropiedadRepository) {
        this.fotoPropiedadRepository = fotoPropiedadRepository;
    }
    public List<FotoPropiedad> getFotosPropiedades() {
        return fotoPropiedadRepository.findAll();
    }
    public void saveFotoPropiedad(FotoPropiedad fotoPropiedad) {
        System.out.println("mi FotoPropiedad es: " + fotoPropiedad);
        fotoPropiedadRepository.save(fotoPropiedad);
    }
}
