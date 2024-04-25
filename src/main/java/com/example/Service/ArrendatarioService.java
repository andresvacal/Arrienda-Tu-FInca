package com.example.Service;


import java.util.List;
import java.util.Optional;

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
        Optional<Arrendatario> ArrendatarioOptional = arrendatarioRepository.findBycorreoElectronico(arrendatario.getCorreoElectronico());       
        
        if (ArrendatarioOptional.isPresent()) {
            System.out.println("El arrendatario ya esta registrado: " + arrendatario);
            throw new IllegalStateException("El correo electronico ya esta registrado");
        }
        arrendatarioRepository.save(arrendatario);
    }

    public void eliminarArrendatario(Long id) {
        boolean exists = arrendatarioRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("El arrendatario con id " + id + " no existe");
        }
        arrendatarioRepository.deleteById(id);
    }

    public void actualizarArrendatario(Long id, Arrendatario arrendatario) {
        Arrendatario arrendatario1 = arrendatarioRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "El arrendatario con id " + id + " no existe"
                ));
        if (arrendatario.getNombres() != null) {
            arrendatario1.setNombres(arrendatario.getNombres());
        }
        if (arrendatario.getApellidos() != null) {
            arrendatario1.setApellidos(arrendatario.getApellidos());
        }
        if (arrendatario.getCorreoElectronico() != null) {
            arrendatario1.setCorreoElectronico(arrendatario.getCorreoElectronico());
        }
        if (arrendatario.getTelefono() != null) {
            arrendatario1.setTelefono(arrendatario.getTelefono());
        }
        if (arrendatario.getPassword() != null) {
            arrendatario1.setPassword(arrendatario.getPassword());
        }
        arrendatarioRepository.save(arrendatario1);
    }
    public Arrendatario login(Arrendatario arrendatario) {
        Optional<Arrendatario> ArrendatarioOptional = arrendatarioRepository.findBycorreoElectronico(arrendatario.getCorreoElectronico());
        System.out.println("Usuario a iniciar sesion" + arrendatario);
        if (ArrendatarioOptional.isPresent()) {
            Arrendatario arrendatario1 = ArrendatarioOptional.get();
            if (arrendatario1.getPassword().equals(arrendatario.getPassword())) {
                return arrendatario1;
            }
        }
        return null;
    }
}
