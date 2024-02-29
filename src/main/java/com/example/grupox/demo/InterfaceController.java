package com.example.grupox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(path = "/grupo27")
public class InterfaceController {
        @GetMapping(path = "/homescreen")
	public String homescreen() {
		return "index";
	}

    @GetMapping(path = "/reqfuncionales")
	public String reqfun() {
		return "requisitosFuncionales";
	}

    @GetMapping(path = "/reqnofuncionales")
	public String reqnofun() {
		return "requisitosNoFuncionales";
	}
 @GetMapping(path = "/diagrama/contexto")
	public String dcontesto() {
		return "diagramaDeContexto";
	}
    @GetMapping(path = "/diagrama/contenedor")
	public String dcontenedor() {
		return "diagramaDeContenedores";
	}
    @GetMapping(path = "/diagrama/componentes")
	public String dcomponentes() {
		return "diagramaDeComponentes";
	}
    @GetMapping(path = "/diagrama/entidad")
	public String dentidadrelacion() {
		return "index";
	}
    @GetMapping(path = "/endpoints")
	public String endpoints() {
		return "Endpoints";
	}
    @GetMapping(path = "/pruebas/frontend")
	public String pruebasfront() {
		return "PruebasFrontEnd";
	}
    @GetMapping(path = "/pruebas/backend")
	public String pruebasback() {
		return "PruebasBackEnd";
	}
    @GetMapping(path = "/despliegue")
	public String despliegue() {
		return "index";
	}
 
}
