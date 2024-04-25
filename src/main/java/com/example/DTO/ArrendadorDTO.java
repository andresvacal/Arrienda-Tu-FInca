package com.example.DTO;

public class ArrendadorDTO {
    private Long idArrendador;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String telefono;
    private String password;

    // Constructor vacío
    public ArrendadorDTO() {
    }

    // Constructor con todos los campos
    public ArrendadorDTO(Long idArrendador, String nombres, String apellidos, String correoElectronico, String telefono, String password) {
        this.idArrendador = idArrendador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.password = password;
    }

    // Métodos de acceso getters y setters
    public Long getIdArrendador() {
        return idArrendador;
    }

    public void setIdArrendador(Long idArrendador) {
        this.idArrendador = idArrendador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}