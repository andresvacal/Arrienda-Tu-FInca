package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ArrendatarioService;
import com.example.entity.Arrendatario;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/grupo27/arrendatario")
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
        System.out.println("mi Arrendatario a guardar es: " + arrendatario);
        arrendatarioService.saveArrendatario(arrendatario);
    }
    @DeleteMapping(path = "{idArrendatario}")
    public void eliminararrendatario(
        @PathVariable("idArrendatario") Long id){
        arrendatarioService.eliminarArrendatario(id);
    }
    @PutMapping(path = "{idArrendatario}")
    public Arrendatario actualizararrendatario(
        @PathVariable("idArrendatario") Long id,
        @RequestBody Arrendatario arrendatario){
        arrendatarioService.actualizarArrendatario(id, arrendatario);
        return arrendatario;
    }
}
