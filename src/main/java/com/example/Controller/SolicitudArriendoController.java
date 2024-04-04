package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.SolicitudArriendoService;
import com.example.entity.SolicitudArriendo;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/solictudaArriendo")
public class SolicitudArriendoController {


    private SolicitudArriendoService solicitudArriendoService;

    @Autowired
    public SolicitudArriendoController(SolicitudArriendoService solicitudArriendoService) {
        this.solicitudArriendoService = solicitudArriendoService;
    }

    @GetMapping(path = "/VerSolicitudesArriendo")
    public List<SolicitudArriendo> getSolicitudArriendo() {
       return solicitudArriendoService.getSolicitudArriendo();
    }
    @PostMapping(path = "/CrearSolicitudArriendo")
    public void guardarSolicitudArriendo(@RequestBody SolicitudArriendo solicitudArriendo) {
        System.out.println("mi SolicitudArriendo es: " + solicitudArriendo);
        solicitudArriendoService.saveSolicitudArriendo(solicitudArriendo);
    }
}
