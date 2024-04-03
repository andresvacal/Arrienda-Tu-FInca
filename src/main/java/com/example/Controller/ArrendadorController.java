package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ArrendadorService;
import com.example.entity.Arrendador;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/arrendador")
public class ArrendadorController {

    private ArrendadorService arrendadorService;
    @Autowired
    public ArrendadorController(ArrendadorService arrendadorService) {
        this.arrendadorService = arrendadorService;
    }
    @GetMapping(path = "/Verarrendadores")
    public void getarrendadores() {
        arrendadorService.getArrendadores();
    }
    @PostMapping(path = "/GuardarArrendador")
    public void guardararrendador(@RequestBody Arrendador arrendador) {
                System.out.println("mi Arrendador a guardar es: " + arrendador);
        arrendadorService.saveArrendador(arrendador);
    }


}
