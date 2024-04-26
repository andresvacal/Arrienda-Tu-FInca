package com.example.DTO;

public class FormularioDTO {

    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private Integer semestre;
    private String descripcion;

    // Getters and setters for all fields

    // Optional: Constructor(s)
    public FormularioDTO() {
    }

    public FormularioDTO(Long id, String nombres, String apellidos, String correo, Integer semestre, String descripcion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.semestre = semestre;
        this.descripcion = descripcion;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
