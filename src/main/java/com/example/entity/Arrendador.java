package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table
public class Arrendador  {

    @Id
    @SequenceGenerator(
            name = "formulario_sequence",
            sequenceName = "formulario_sequence",
            allocationSize = 1
    )  
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "formulario_sequence"
    )
    private Long idUsuario;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String telefono;
    private String password;

   @OneToMany(mappedBy = "arrendador") 
    private List<Propiedad> propiedades;

     @OneToMany(mappedBy = "arrendador")
    private List<SolicitudArriendo> solicitudes;

}
