package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Arrendatario extends Usuario {

    @OneToMany(mappedBy = "arrendatario")
    private List<SolicitudArriendo> solicitudes;

    @OneToMany(mappedBy = "arrendatario")
    private List<Pago> pagos;

    
}

