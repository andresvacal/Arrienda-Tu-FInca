package com.example.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.PropiedadRepository;
import com.example.Repository.ResenaRepository;
import com.example.entity.Propiedad;
import com.example.entity.Resena;


@Service
public class ResenasService {

    private ResenaRepository resenaRepository;

    public List<Resena> getResenas(Long propiedadid) {

        return resenaRepository.findAll();
    }
}
