package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.FormularioService;
import com.example.entity.Formulario;
import com.example.entity.Propiedad;
import com.example.Service.PropiedadService;

/*Controladores para retornar contenido */

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/grupo27")
public class WebController {



    private FormularioService formularioService;
    private PropiedadService propiedadService;

@Autowired
	public WebController(FormularioService formularioService) {
		this.formularioService = formularioService;
	}

	@PostMapping(path = "/subirpregunta")
    public void submitForm(@RequestBody Formulario formulario) {
        System.out.println("mi formulario" + formulario);

        formularioService.saveFormulario(formulario);

    }
	@GetMapping(path = "/subirpregunta")
	public void getforms() {
        formularioService.getFormularios();

    }
    @PostMapping(path = "/GuardarPropiedad")
	public void guardarpropiedad(@RequestBody Propiedad propiedad) {
        propiedadService.savepropiedad(propiedad);
    }

}