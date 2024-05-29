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

@RestController
@RequestMapping(value = "/jwt/security/autenticar")
public class AutenticacionController {

    @Autowired
    JWTTokenService jwtTokenService;
    @CrossOrigin
    @PostMapping(  value = "/autenticar", produces = MediaType.APPLICATION_JSON_VALUE)
    public TokenDTO autenticar( @RequestBody ArrendadorDTO usuarioDTO ){
        return new TokenDTO(jwtTokenService.generarToken(usuarioDTO), usuarioDTO);
    }
    @CrossOrigin
    @PostMapping(  value = "/autenticar-correo-contrasena", produces = MediaType.APPLICATION_JSON_VALUE)
    public String autenticar( @RequestParam String correo, @RequestParam String contrasena ){
        //ArrendadorDTO usuarioDTO = new ArrendadorDTO(3, "Pablo", "Marquez", correo);
        return jwtTokenService.generarToken(usuarioDTO);
    }
}
