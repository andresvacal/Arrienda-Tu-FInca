package com.example.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ResenaRepository;
import com.example.entity.Resena;


@Service
public class ResenasService {
    @Autowired

    private ResenaRepository resenaRepository;

    public List<Resena> getResenas(Long propiedadid) {
        return resenaRepository.findAll();
    }
    public void addResena(Resena resena, Long idSolicitud) {
        if (idSolicitud != null) {
            Resena existingResena = resenaRepository.findById(idSolicitud).orElse(null);
            System.out.println("ID de solicitud: " + idSolicitud);
            if (existingResena != null) {
                // If the object already exists, update its attributes
                existingResena.setValorresena(resena.getValorresena());
                existingResena.setTextoresena(resena.getTextoresena());
                resenaRepository.save(existingResena);
                System.out.println("Reseña actualizada exitosamente: " + existingResena.toString());
            } else {
                // If the object doesn't exist, set its ID and save it
                resena.setIdresena(idSolicitud);
                resenaRepository.save(resena);
                System.out.println("Reseña guardada exitosamente: " + resena.toString());
            }
        } else {
            System.out.println("Error: El ID de solicitud es nulo.");
        }
    }
    public List<Resena> getResenas() {
        return resenaRepository.findAll();
    }
    public boolean existeResena(Long idSolicitud) {
        if (resenaRepository.existsById(idSolicitud)) {
            return true;
        } else {
            return false;
        }
}
}
