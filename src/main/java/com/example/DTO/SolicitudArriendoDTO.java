package com.example.DTO;
import java.util.Date;

public class SolicitudArriendoDTO {

    private Long idSolicitud;
    private Date fechaSolicitud;
    private Date fechaLlegada;
    private Date fechaSalida;
    private double valor;
    private String estado;

    // Optional: Include DTOs for related entities (consider data privacy and complexity)
    // private PropiedadDTO propiedad;
    // private ArrendadorDTO arrendador;
    // private ArrendatarioDTO arrendatario;

    // Getters and setters for all fields

    // Optional: Constructor(s)
    public SolicitudArriendoDTO() {
    }

    public SolicitudArriendoDTO(Long idSolicitud, Date fechaSolicitud, Date fechaLlegada, Date fechaSalida, double valor, String estado) {
        this.idSolicitud = idSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.valor = valor;
        this.estado = estado;
    }

    // Getters
    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public double getValor() {
        return valor;
    }

    public String getEstado() {
        return estado;
    }

    // Optional: Getters for related entity DTOs (if included)
    // public PropiedadDTO getPropiedad() {
    //     return propiedad;
    // }
    // public ArrendadorDTO getArrendador() {
    //     return arrendador;
    // }
    // public ArrendatarioDTO getArrendatario() {
    //     return arrendatario;
    // }

    // Setters
    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Optional: Setters for related entity DTOs (if included)
    // public void setPropiedad(PropiedadDTO propiedad) {
    //     this.propiedad = propiedad;
    // }
    // public void setArrendador(ArrendadorDTO arrendador) {
    //     this.arrendador = arrendador;
    // }
    // public void setArrendatario(ArrendatarioDTO arrendatario) {
    //     this.arrendatario = arrendatario;
    // }
}