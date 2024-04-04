package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class FotoPropiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoto;

    private String nombreArchivo;

    
    @ManyToOne
    private Propiedad propiedad;


    public FotoPropiedad() {
    }


}
