package com.example.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ResenasService;
import com.example.entity.Resena;

@CrossOrigin(origins = "*")

@RestController
public class ResenaController {
    private ResenasService resenaService;
    @Autowired
    public ResenaController(ResenasService resenasService) {
        this.resenaService = resenasService;
    }
    @GetMapping(path = "/{idPropiedad}")
    public List<Resena> getResenasByPropiedad() {
        Long idPropiedad = 1L;
        return resenaService.getResenas(idPropiedad);
    }

}
