package com.example.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.PagoRepository;
@Service
public class PagoService {
    private final PagoRepository pagoRepository;


    @Autowired
    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

}
