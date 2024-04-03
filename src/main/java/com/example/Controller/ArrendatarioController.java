package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ArrendatarioService;
import com.example.entity.Arrendatario;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/arrendatario")
public class ArrendatarioController {
    private ArrendatarioService arrendatarioService;

    @Autowired
    public ArrendatarioController(ArrendatarioService arrendatarioService) {
        this.arrendatarioService = arrendatarioService;
    }
    @GetMapping(path = "/Verarrendatarios")
    public List<Arrendatario> getarrendatarios() {
        return arrendatarioService.getArrendatarios();
    }
    @PostMapping(path = "/GuardarArrendatario")
    public void guardararrendatario(@RequestBody Arrendatario arrendatario) {
        arrendatarioService.saveArrendatario(arrendatario);
    }
}
