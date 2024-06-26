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

import com.example.Service.PropiedadService;
import com.example.entity.Propiedad;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/grupo27/propiedad")
public class PropiedadController {

        private PropiedadService propiedadService;
    @Autowired
        public PropiedadController(PropiedadService propiedadService) {
            this.propiedadService = propiedadService;
        }


    @GetMapping(path = "/Verpropiedades")
    public List<Propiedad> getpropiedades() {
        return propiedadService.getPropiedades();
    }
    @GetMapping(path = "/Verpropiedad/{idArrendador}")
    public Propiedad getpropiedadesArrendador(@PathVariable Long idArrendador) {
        return propiedadService.getPropiedad(idArrendador);
    }
    //Rest de propiedades
    @PostMapping(path = "/GuardarPropiedad/{idArrendador}")
	public void guardarpropiedad(@PathVariable Long idArrendador, @RequestBody Propiedad propiedad) {
        System.out.println("mi propiedad es: " + propiedad);
        propiedadService.savepropiedad(idArrendador, propiedad);
    }
    @DeleteMapping(path = "/{idPropiedad}")
    public void eliminarpropiedad(
        @PathVariable("idPropiedad") Long id){
        propiedadService.eliminarPropiedad(id);
    }

    @PutMapping(path = "/{idPropiedad}")
    public Propiedad actualizarpropiedad(
        @PathVariable("idPropiedad") Long id,
        @RequestBody Propiedad propiedad){
        propiedadService.actualizarPropiedad(id, propiedad);
        return propiedad;
    }


}
