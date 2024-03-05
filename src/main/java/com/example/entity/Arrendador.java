package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
public class Arrendador extends Usuario {

   @OneToMany(mappedBy = "arrendador") 
    private List<Propiedad> propiedades;

     @OneToMany(mappedBy = "arrendador")
    private List<SolicitudArriendo> solicitudes;

}
