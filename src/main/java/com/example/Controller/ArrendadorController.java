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

import com.example.Service.ArrendadorService;
import com.example.entity.Arrendador;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/grupo27/arrendador")
public class ArrendadorController {

    private ArrendadorService arrendadorService;
    @Autowired
    public ArrendadorController(ArrendadorService arrendadorService) {
        this.arrendadorService = arrendadorService;
    }
    @GetMapping(path = "/Verarrendadores")
    public List<Arrendador> getarrendadores() {
        System.out.println("Mostrando arrendadores: ");
        return arrendadorService.getArrendadores();
    }
    @PostMapping(path = "/GuardarArrendador")
    public void guardararrendador(@RequestBody Arrendador arrendador) {
                System.out.println("mi Arrendador a guardar es: " + arrendador);
        arrendadorService.saveArrendador(arrendador);
    }
    @DeleteMapping(path = "{idArrendador}")
    public void eliminararrendador(
        @PathVariable("idArrendador") Long id){
        arrendadorService.eliminarArrendador(id);
    }
    @PutMapping(path = "{idArrendador}")
    public Arrendador actualizararrendador(
        @PathVariable("idArrendador") Long id,
        @RequestBody Arrendador arrendador){
        arrendadorService.actualizarArrendador(id, arrendador);
        return arrendador;
    }
    @PostMapping(path = "/login")
    public Arrendador login(@RequestBody Arrendador arrendador){
        return arrendadorService.login(arrendador);
    }

}
