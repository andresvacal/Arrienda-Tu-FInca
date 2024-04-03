package com.example.entity;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
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
    public Propiedad(String nombre, String departamento, String municipio, String tipoIngreso, String descripcion,
            int cantidadHabitaciones, int cantidadBanios, boolean permiteMascotas, boolean tienePiscina,
            boolean tieneAsador, double valorNoche) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.municipio = municipio;
        this.tipoIngreso = tipoIngreso;
        this.descripcion = descripcion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadBanios = cantidadBanios;
        this.permiteMascotas = permiteMascotas;
        this.tienePiscina = tienePiscina;
        this.tieneAsador = tieneAsador;
        this.valorNoche = valorNoche;
    }

@Override
public String toString() {
        return "Propiedad [idPropiedad=" + idPropiedad + ", nombre=" + nombre + ", departamento=" + departamento
                        + ", municipio=" + municipio + ", tipoIngreso=" + tipoIngreso + ", descripcion=" + descripcion
                        + ", cantidadHabitaciones=" + cantidadHabitaciones + ", cantidadBanios=" + cantidadBanios
                        + ", permiteMascotas=" + permiteMascotas + ", tienePiscina=" + tienePiscina + ", tieneAsador="
                        + tieneAsador + ", valorNoche=" + valorNoche + ", arrendador=" + arrendador + "]";
}

@ManyToOne
private Arrendador arrendador;
    
@OneToMany(mappedBy = "propiedad")
    private List<FotoPropiedad> fotos;
public Propiedad() {
}

}
