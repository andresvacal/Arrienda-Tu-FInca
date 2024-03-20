package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.SolicitudArriendoRepository;
@Service
public class SolicitudArriendoService {
    private final SolicitudArriendoRepository solicitudArriendoRepository;
    
    @Autowired
    public SolicitudArriendoService(SolicitudArriendoRepository solicitudArriendoRepository) {
        this.solicitudArriendoRepository = solicitudArriendoRepository;
    }

}
