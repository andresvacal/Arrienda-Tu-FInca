package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Usuario {

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos
                + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + ", password=" + password
                + "]";
    }
    public Usuario(String nombres, String apellidos, String correoElectronico, String telefono, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.password = password;
    }
    public Usuario(Long idUsuario, String nombres, String apellidos, String correoElectronico, String telefono,
            String password) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.password = password;
    }
    public Usuario() {
    }
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
    private Long idUsuario;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String telefono;
    private String password;
    public Long getIdUsuario() {
        return idUsuario;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getPassword() {
        return password;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}




