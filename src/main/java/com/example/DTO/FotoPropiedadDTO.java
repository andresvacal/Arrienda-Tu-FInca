package com.example.DTO;

public class FotoPropiedadDTO {

    private Long idFoto;
    private String nombreArchivo;
    // Optional: Include propiedad details if needed (consider privacy and data transfer size)
    // private PropiedadDTO propiedad;

    // Getters and setters for all fields

    // Optional: Constructor(s)
    public FotoPropiedadDTO() {
    }

    public FotoPropiedadDTO(Long idFoto, String nombreArchivo) {
        this.idFoto = idFoto;
        this.nombreArchivo = nombreArchivo;
    }

    // Getters
    public Long getIdFoto() {
        return idFoto;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    // Optional: Getter for propiedad (if included)
    // public PropiedadDTO getPropiedad() {
    //     return propiedad;
    // }

    // Setters
    public void setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    // Optional: Setter for propiedad (if included)
    // public void setPropiedad(PropiedadDTO propiedad) {
    //     this.propiedad = propiedad;
    // }
}