package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.ArrendadorDTO;
import com.example.DTO.TokenDTO;
import com.example.Service.JWTTokenService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/jwt/security/autenticar")
public class AutenticacionController {

    @Autowired
    JWTTokenService jwtTokenService;
    @CrossOrigin
    @PostMapping(  path = "/autenticar")

    public TokenDTO autenticar( @RequestBody ArrendadorDTO usuarioDTO ){
        return new TokenDTO(jwtTokenService.generarToken(usuarioDTO), usuarioDTO);
    }
    @CrossOrigin
    @PostMapping(  path = "/autenticar-correo-contrasena")
    public String autenticar( @RequestParam String correo, @RequestParam String contrasena ){
        Long id = 1L;
        String nombres = "Juan";
        String apellidos = "Perez";
        String correoElectronico = "juan.perez@example.com";
        String telefono = "1234567890";
        String password = "securepassword";

        ArrendadorDTO usuarioDTO = new ArrendadorDTO(id, nombres, apellidos, correoElectronico, telefono, password);
        return jwtTokenService.generarToken(usuarioDTO);
    }
}
