package com.example.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendadorRepository;
import com.example.Repository.SolicitudArriendoRepository;
import com.example.entity.Arrendador;
import com.example.entity.SolicitudArriendo;
@Service
public class SolicitudArriendoService {
    private final SolicitudArriendoRepository solicitudArriendoRepository;
    private final ArrendadorRepository arrendadorRepository;
    @Autowired
    public SolicitudArriendoService(SolicitudArriendoRepository solicitudArriendoRepository, ArrendadorRepository arrendadorRepository) {
        this.solicitudArriendoRepository = solicitudArriendoRepository;
        this.arrendadorRepository = arrendadorRepository;
    }


    public List<SolicitudArriendo> getSolicitudArriendo() {
        return solicitudArriendoRepository.findAll();
    }

    public void saveSolicitudArriendo(SolicitudArriendo solicitudArriendo) {
        System.out.println("mi SolicitudArriendo es 2 antes del save: " + solicitudArriendo);
        solicitudArriendoRepository.save(solicitudArriendo);
    }
    public List<SolicitudArriendo> viewReservas(Long idArrendador) {
        // Check if the Arrendador exists
        Arrendador arrendador = arrendadorRepository.findById(idArrendador)
            .orElseThrow(() -> new IllegalStateException(
                    "Arrendatario con id " + idArrendador + " no existe"
                ));
    
        // Fetch and return only the SolicitudArriendo associated with this Arrendador
        return solicitudArriendoRepository.findByArrendadorIdArrendador(idArrendador);
    }
    public void deleteSolicitudArriendo(Long idSolicitud) {
        boolean exists = solicitudArriendoRepository.existsById(idSolicitud);
        if (!exists) {
            throw new IllegalStateException(
                "SolicitudArriendo con id " + idSolicitud + " no existe"
            );
        }
        solicitudArriendoRepository.deleteById(idSolicitud);}
}
