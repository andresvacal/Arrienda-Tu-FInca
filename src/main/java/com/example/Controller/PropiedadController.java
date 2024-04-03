package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.PropiedadService;
import com.example.entity.Propiedad;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/propiedad")
public class PropiedadController {

        private PropiedadService propiedadService;
    @Autowired
        public PropiedadController(PropiedadService propiedadService) {
            this.propiedadService = propiedadService;
        }


    @GetMapping(path = "/Verpropiedades")
    public void getpropiedades() {
        propiedadService.getPropiedades();
    }

    //Rest de propiedades
    @PostMapping(path = "/GuardarPropiedad")
	public void guardarpropiedad(@RequestBody Propiedad propiedad) {
        System.out.println("mi propiedad es: " + propiedad);
        propiedadService.savepropiedad(propiedad);
    }


}
