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

    public Arrendatario(String nombres, String apellidos, String correoElectronico, String telefono, String password,
            List<SolicitudArriendo> solicitudes, List<Pago> pagos) {
        super(nombres, apellidos, correoElectronico, telefono, password);
        this.solicitudes = solicitudes;
        this.pagos = pagos;
    }

    public Arrendatario(Long idUsuario, String nombres, String apellidos, String correoElectronico, String telefono,
            String password, List<SolicitudArriendo> solicitudes, List<Pago> pagos) {
        super(idUsuario, nombres, apellidos, correoElectronico, telefono, password);
        this.solicitudes = solicitudes;
        this.pagos = pagos;
    }

    public Arrendatario(List<SolicitudArriendo> solicitudes, List<Pago> pagos) {
        this.solicitudes = solicitudes;
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        return "Arrendatario [solicitudes=" + solicitudes + ", pagos=" + pagos + "]";
    }

    public List<SolicitudArriendo> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudArriendo> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }



    
}

