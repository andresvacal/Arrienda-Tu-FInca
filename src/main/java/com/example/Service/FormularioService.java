package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Repository.FormularioRepository;
import com.example.entity.Formulario;

@Service
public class FormularioService {

    private final FormularioRepository formularioRepository;

    @Autowired
    public FormularioService(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }

    public ResponseEntity<String> saveFormulario(Formulario formulario) {
        System.out.println("mi formulario" + formulario);

        formularioRepository.save(formulario);
                return new ResponseEntity<>("Formulario submitted successfully", HttpStatus.CREATED);

    }

    public List<Formulario> getFormularios() {
        return (List<Formulario>) formularioRepository.findAll();
    }

    
}
