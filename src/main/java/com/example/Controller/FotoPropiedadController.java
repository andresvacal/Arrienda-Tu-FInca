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

import com.example.Service.FotoPropiedadService;
import com.example.entity.FotoPropiedad;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/grupo27/fotoPropiedad")
public class FotoPropiedadController {
 private FotoPropiedadService fotoPropiedadService;
    

 @Autowired
    public FotoPropiedadController(FotoPropiedadService fotoPropiedadService) {
        this.fotoPropiedadService = fotoPropiedadService;
    }
    @GetMapping(path = "/VerfotosPropiedades")
    public List<FotoPropiedad> getfotosPropiedades() {
        return fotoPropiedadService.getFotosPropiedades();
    }
    @PostMapping(path = "/GuardarFotoPropiedad/{idPropiedad}")
    public void guardarFotoPropiedad(@PathVariable Long idPropiedad,@RequestBody FotoPropiedad fotoPropiedad) {
                System.out.println("mi FotoPropiedad a guardar es: " + fotoPropiedad);
        fotoPropiedadService.saveFotoPropiedad(idPropiedad, fotoPropiedad);
    }
    @DeleteMapping(path = "{idFotoPropiedad}")
    public void eliminarFotoPropiedad(
        @PathVariable("idFotoPropiedad") Long id){
        fotoPropiedadService.eliminarFotoPropiedad(id);
    }
    @PutMapping(path = "{idFotoPropiedad}")
    public FotoPropiedad actualizarFotoPropiedad(
        @PathVariable("idFotoPropiedad") Long id,
        @RequestBody FotoPropiedad fotoPropiedad){
        fotoPropiedadService.actualizarFotoPropiedad(id, fotoPropiedad);
        return fotoPropiedad;
    }
    
}
