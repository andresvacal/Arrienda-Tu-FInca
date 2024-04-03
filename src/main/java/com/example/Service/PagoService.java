package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.PagoRepository;
import com.example.entity.Pago;

@Service
public class PagoService {
    private final PagoRepository pagoRepository;


    @Autowired
    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }
    public List<Pago> getPagos() {
        return pagoRepository.findAll();
    }

    public void savePago(Pago pago) {
        System.out.println("mi Pago es: " + pago);
        pagoRepository.save(pago);
    }
    

}
