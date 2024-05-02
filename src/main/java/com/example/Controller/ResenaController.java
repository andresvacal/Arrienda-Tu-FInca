package com.example.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ResenasService;
import com.example.entity.Resena;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/grupo27/resena")
public class ResenaController {
    private ResenasService resenaService;
    @Autowired
    public ResenaController(ResenasService resenasService) {
        this.resenaService = resenasService;
    }
    @GetMapping(path = "/VerResenas")
    public List<Resena> getResenas() {
        return resenaService.getResenas();
    }

    @GetMapping(path = "/propiedad/{idPropiedad}")
    public List<Resena> getResenasByPropiedad(@PathVariable Long idPropiedad) {
        System.out.println("ID de propiedad: " + idPropiedad);
        return resenaService.getResenas(idPropiedad);
    }
    @PostMapping(path = "/{idSolicitud}")
    public void addResena(@RequestBody Resena resena, @PathVariable Long idSolicitud) {
        System.out.println("Reseña Texto: " + resena.getTextoresena());

        resenaService.addResena(resena, idSolicitud);
    }
    @GetMapping(path = "/{idSolicitud}")
    public boolean existeResena(@PathVariable Long idSolicitud) {
        return resenaService.existeResena(idSolicitud);
    }

}
