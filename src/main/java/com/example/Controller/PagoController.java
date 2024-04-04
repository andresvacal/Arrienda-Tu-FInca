package com.example.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.PagoService;
import com.example.entity.Pago;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path = "/pago")
public class PagoController {
private final PagoService pagoService;

@Autowired
public PagoController(PagoService pagoService) {
    this.pagoService = pagoService;
}

@GetMapping(path = "/VerPagos")
public List<Pago> getPagos() {
    return pagoService.getPagos();
}
@PostMapping(path = "/GuardarPago")
public void guardarPago(Pago pago) {
    System.out.println("mi Pago es: " + pago);
    pagoService.savePago(pago);
}
@DeleteMapping(path = "{idPago}")   
public void eliminarPago(
    @PathVariable("idPago") Long id){
    pagoService.eliminarPago(id);}
}