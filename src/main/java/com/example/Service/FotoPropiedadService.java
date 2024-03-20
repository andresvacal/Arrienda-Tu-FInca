package com.example.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.FotoPropiedadRepository;
@Service
public class FotoPropiedadService {
    private final FotoPropiedadRepository fotoPropiedadRepository;
    @Autowired
    public FotoPropiedadService(FotoPropiedadRepository fotoPropiedadRepository) {
        this.fotoPropiedadRepository = fotoPropiedadRepository;
    }

}
