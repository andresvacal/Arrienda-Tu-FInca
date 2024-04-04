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
    public void eliminarFotoPropiedad(Long id) {
        boolean exists = fotoPropiedadRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                "FotoPropiedad con id " + id + " no existe"
            );
        }
        fotoPropiedadRepository.deleteById(id);
    }
    public void actualizarFotoPropiedad(Long id, FotoPropiedad fotoPropiedad) {
        FotoPropiedad fotoPropiedadActual = fotoPropiedadRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException(
                "FotoPropiedad con id " + id + " no existe"
            ));
        fotoPropiedadActual.setNombreArchivo(fotoPropiedad.getNombreArchivo());
        fotoPropiedadRepository.save(fotoPropiedadActual);
    }
}
