package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Repository.ArrendadorRepository;
import com.example.Repository.PropiedadRepository;
import com.example.entity.Arrendador;
import com.example.entity.Propiedad;

@Service
public class PropiedadService {

    private final PropiedadRepository propiedadRepository;
    private final ArrendadorRepository arrendadorRepository;

    public PropiedadService(PropiedadRepository propiedadRepository, ArrendadorRepository arrendadorRepository) {
        this.propiedadRepository = propiedadRepository;
        this.arrendadorRepository = arrendadorRepository;
    }

    @Autowired


    public List<Propiedad> getPropiedades() {
        return propiedadRepository.findAll();
    }

    public Propiedad getPropiedad(Long id) {
        return propiedadRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("La propiedad con id " + id + " no existe"));
    }
    
    public void savepropiedad(Long idArrendador,Propiedad propiedad) {
        System.out.println("mi propiedad a guardar: " + propiedad);
        
Arrendador arrendador = arrendadorRepository.findById(idArrendador)
                .orElseThrow(() -> new IllegalStateException("Arrendador con ese " + idArrendador + " not found"));
        propiedad.setArrendador(arrendador);

        propiedadRepository.save(propiedad);

    }

    public void eliminarPropiedad(Long id) {
        boolean exists = propiedadRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("La propiedad con id " + id + " no existe");
        }
        propiedadRepository.deleteById(id);
    }
    
    public void actualizarPropiedad(Long id, Propiedad propiedad) {
        Propiedad propiedad1 = propiedadRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "La propiedad con id " + id + " no existe"
                ));
                if (propiedad.getNombre() != null) {
                    propiedad1.setNombre(propiedad.getNombre());
                }
                if (propiedad.getDepartamento() != null) {
                    propiedad1.setDepartamento(propiedad.getDepartamento());
                }
                if (propiedad.getMunicipio() != null) {
                    propiedad1.setMunicipio(propiedad.getMunicipio());
                }
                if (propiedad.getTipoIngreso() != null) {
                    propiedad1.setTipoIngreso(propiedad.getTipoIngreso());
                }
                if (propiedad.getDescripcion() != null) {
                    propiedad1.setDescripcion(propiedad.getDescripcion());
                }
                if (propiedad.getCantidadHabitaciones() != 0) {
                    propiedad1.setCantidadHabitaciones(propiedad.getCantidadHabitaciones());
                }
                if (propiedad.getCantidadBanios() != 0) {
                    propiedad1.setCantidadBanios(propiedad.getCantidadBanios());
                }
                if (propiedad.isPermiteMascotas() != false) {
                    propiedad1.setPermiteMascotas(propiedad.isPermiteMascotas());
                }
                if (propiedad.isTienePiscina() != false) {
                    propiedad1.setTienePiscina(propiedad.isTienePiscina());
                }
                if (propiedad.isTieneAsador() != false) {
                    propiedad1.setTieneAsador(propiedad.isTieneAsador());
                }
                if (propiedad.getValorNoche() != 0.0) {
                    propiedad1.setValorNoche(propiedad.getValorNoche());
                }
        propiedadRepository.save(propiedad1);
    }

}


