package com.example.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.FotoPropiedadRepository;
import com.example.Repository.PropiedadRepository;
import com.example.entity.FotoPropiedad;
import com.example.entity.Propiedad;
@Service
public class FotoPropiedadService {
    private final FotoPropiedadRepository fotoPropiedadRepository;
    private final PropiedadRepository propiedadRepository;
    
    public FotoPropiedadService(FotoPropiedadRepository fotoPropiedadRepository,
            PropiedadRepository propiedadRepository) {
        this.fotoPropiedadRepository = fotoPropiedadRepository;
        this.propiedadRepository = propiedadRepository;
    }
    @Autowired

    public List<FotoPropiedad> getFotosPropiedades() {
        return fotoPropiedadRepository.findAll();
    }
    public void saveFotoPropiedad(Long idPropiedad,FotoPropiedad fotoPropiedad) {
        System.out.println("mi FotoPropiedad es: " + fotoPropiedad);

        Propiedad propiedad = propiedadRepository.findByIdPropiedad(idPropiedad)
            .orElseThrow(() -> new IllegalStateException(
                "Propiedad con id " + idPropiedad + " no existe"
            ));
       propiedad.getFotos().add(fotoPropiedad);
        fotoPropiedadRepository.save(fotoPropiedad);
        propiedadRepository.save(propiedad);
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
