package com.example.DTO;

import java.sql.Date;

public class PagoDTO {

    private Long idPago;
    private ArrendatarioDTO arrendatario; // DTO for Arrendatario entity
    private SolicitudArriendoDTO solicitud; // DTO for SolicitudArriendo entity (assuming OneToOne relationship)
    private double monto;
    private Date fechaPago;
    private String metodoPago;
    private String estado;

    // Getters and setters for all fields

    // Optional: Constructor(s)
    public PagoDTO() {
    }

    public PagoDTO(Long idPago, ArrendatarioDTO arrendatario, SolicitudArriendoDTO solicitud, double monto, Date fechaPago, String metodoPago, String estado) {
        this.idPago = idPago;
        this.arrendatario = arrendatario;
        this.solicitud = solicitud;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    // Getters
    public Long getIdPago() {
        return idPago;
    }

    public ArrendatarioDTO getArrendatario() {
        return arrendatario;
    }

    public SolicitudArriendoDTO getSolicitud() {
        return solicitud;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public void setArrendatario(ArrendatarioDTO arrendatario) {
        this.arrendatario = arrendatario;
    }

    public void setSolicitud(SolicitudArriendoDTO solicitud) {
        this.solicitud = solicitud;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}