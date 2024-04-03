package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.SolicitudArriendoRepository;
import com.example.entity.SolicitudArriendo;
@Service
public class SolicitudArriendoService {
    private final SolicitudArriendoRepository solicitudArriendoRepository;
    
    @Autowired
    public SolicitudArriendoService(SolicitudArriendoRepository solicitudArriendoRepository) {
        this.solicitudArriendoRepository = solicitudArriendoRepository;
    }


    public List<SolicitudArriendo> getSolicitudArriendo() {
        return solicitudArriendoRepository.findAll();
    }

    public void saveSolicitudArriendo(SolicitudArriendo solicitudArriendo) {
        System.out.println("mi SolicitudArriendo es: " + solicitudArriendo);
        solicitudArriendoRepository.save(solicitudArriendo);
    }

}
