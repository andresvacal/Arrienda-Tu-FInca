package com.example.DTO;


import java.util.List;

public class PropiedadDTO {

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

    // Optional: Include ArrendadorDTO if needed (data privacy considerations)
    private ArrendadorDTO arrendador;

    // Include FotoPropiedadDTO list
    private List<FotoPropiedadDTO> fotos;

    // Getters and setters for all fields

    // Optional: Constructor(s)
    public PropiedadDTO() {
    }

    public PropiedadDTO(Long idPropiedad, String nombre, String departamento, String municipio, String tipoIngreso,
                        String descripcion, int cantidadHabitaciones, int cantidadBanios, boolean permiteMascotas,
                        boolean tienePiscina, boolean tieneAsador, double valorNoche, ArrendadorDTO arrendador,
                        List<FotoPropiedadDTO> fotos) {
        this.idPropiedad = idPropiedad;
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
        this.arrendador = arrendador;
        this.fotos = fotos;
    }

    // Getters
    public Long getIdPropiedad() {
        return idPropiedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getTipoIngreso() {
        return tipoIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public boolean isPermiteMascotas() {
        return permiteMascotas;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public boolean isTieneAsador() {
        return tieneAsador;
    }

    public double getValorNoche() {
        return valorNoche;
    }

    public ArrendadorDTO getArrendador() {
        return arrendador;
    }

    public List<FotoPropiedadDTO> getFotos() {
        return fotos;
    }

    // Setters
    public void setIdPropiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setTipoIngreso(String tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public void setPermiteMascotas(boolean permiteMascotas) {
        this.permiteMascotas = permiteMascotas;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public void setTieneAsador(boolean tieneAsador) {
        this.tieneAsador = tieneAsador;}
    }