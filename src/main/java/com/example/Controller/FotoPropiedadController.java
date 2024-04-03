package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.FotoPropiedadService;
import com.example.entity.FotoPropiedad;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/fotoPropiedad")
public class FotoPropiedadController {
 private FotoPropiedadService fotoPropiedadService;

 @Autowired
    public FotoPropiedadController(FotoPropiedadService fotoPropiedadService) {
        this.fotoPropiedadService = fotoPropiedadService;
    }
    @GetMapping(path = "/VerfotosPropiedades")
    public void getfotosPropiedades() {
        fotoPropiedadService.getFotosPropiedades();
    }
    @PostMapping(path = "/GuardarFotoPropiedad")
    public void guardarFotoPropiedad(@RequestBody FotoPropiedad fotoPropiedad) {
                System.out.println("mi FotoPropiedad a guardar es: " + fotoPropiedad);
        fotoPropiedadService.saveFotoPropiedad(fotoPropiedad);
    }
}
