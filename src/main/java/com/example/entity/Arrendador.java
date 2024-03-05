package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Arrendador extends Usuario {

  /*  @OneToMany(mappedBy = "arrendador") */
    private List<Propiedad> propiedades;

   /*  @OneToMany(mappedBy = "arrendador")*/
    private List<SolicitudArriendo> solicitudes;



    public Arrendador(String nombres, String apellidos, String correoElectronico, String telefono, String password,
            List<Propiedad> propiedades, List<SolicitudArriendo> solicitudes) {
        super(nombres, apellidos, correoElectronico, telefono, password);
        this.propiedades = propiedades;
        this.solicitudes = solicitudes;
    }



    public Arrendador(Long idUsuario, String nombres, String apellidos, String correoElectronico, String telefono,
            String password, List<Propiedad> propiedades, List<SolicitudArriendo> solicitudes) {
        super(idUsuario, nombres, apellidos, correoElectronico, telefono, password);
        this.propiedades = propiedades;
        this.solicitudes = solicitudes;
    }



    public Arrendador(String nombres, String apellidos, String correoElectronico, String telefono, String password) {
        super(nombres, apellidos, correoElectronico, telefono, password);
    }



    @Override
    public String toString() {
        return "Arrendador [propiedades=" + propiedades + ", solicitudes=" + solicitudes + "]";
    }



    public List<Propiedad> getPropiedades() {
        return propiedades;
    }



    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }



    public List<SolicitudArriendo> getSolicitudes() {
        return solicitudes;
    }



    public void setSolicitudes(List<SolicitudArriendo> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
