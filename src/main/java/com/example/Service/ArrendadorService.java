package com.example.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Arrendador> ArrendadorOptional = arrendadorRepository.findBycorreoElectronico(arrendador.getCorreoElectronico());

        if (ArrendadorOptional.isPresent()) {
            System.out.println("El arrendador ya esta registrado: " + arrendador);
            throw new IllegalStateException("El correo electronico ya esta registrado");
        }
        
        arrendadorRepository.save(arrendador);
    }

    public void eliminarArrendador(Long id) {
        boolean exists = arrendadorRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("El arrendador con id " + id + " no existe");
        }
        arrendadorRepository.deleteById(id);
    }

    public void actualizarArrendador(Long id, Arrendador arrendador) {
        Arrendador arrendador1 = arrendadorRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "El arrendador con id " + id + " no existe"
                ));
        if (arrendador.getNombres() != null) {
            arrendador1.setNombres(arrendador.getNombres());
        }
        if (arrendador.getApellidos() != null) {
            arrendador1.setApellidos(arrendador.getApellidos());
        }
        if (arrendador.getCorreoElectronico() != null) {
            arrendador1.setCorreoElectronico(arrendador.getCorreoElectronico());
        }
        if (arrendador.getTelefono() != null) {
            arrendador1.setTelefono(arrendador.getTelefono());
        }
        if (arrendador.getPassword() != null) {
            arrendador1.setPassword(arrendador.getPassword());
        }
        arrendadorRepository.save(arrendador1);
    }

}
