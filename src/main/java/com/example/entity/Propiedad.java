package com.example.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Propiedad {

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
@Column(name = "idPropiedad", nullable = false, updatable = false)
    private Long idPropiedad;

    private String nombre;
    private String departamento;
    private String municipio;
    private String tipoIngreso;
    private String descripcion;
    private int cantidadHabitaciones;
    private int cantidadBanios;
    private boolean permiteMascotas;
    private boolean tienePiscina;
    private boolean tieneAsador;
    private double valorNoche;

    /*@ManyToOne
    private Arrendador arrendador;

    /*@OneToMany(mappedBy = "propiedad")
    private List<FotoPropiedad> fotos;
*/
   
    
}
