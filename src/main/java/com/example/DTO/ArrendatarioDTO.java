package com.example.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrendatarioDTO {

    private Long idArrendatario;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String telefono;
    private String password; }
