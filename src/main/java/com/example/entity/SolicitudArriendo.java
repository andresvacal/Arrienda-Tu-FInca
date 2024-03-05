package com.example.entity;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class SolicitudArriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSolicitud;

    private Date fechaSolicitud;
    private Date fechaLlegada;
    private Date fechaSalida;
    private double valor;
    private String estado;

    @ManyToOne 
    private Propiedad propiedad;

    @ManyToOne
    private Arrendador arrendador;

    @ManyToOne
    private Arrendatario arrendatario;
}
