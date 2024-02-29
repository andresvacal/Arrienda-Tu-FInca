package com.example.grupox.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Repository.FormularioRepository;
import com.example.formulario.Formulario;

@Service
public class FormularioService {

    private final FormularioRepository formularioRepository;

    @Autowired
    public FormularioService(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }

    public ResponseEntity<String> saveFormulario(Formulario formulario) {
        formularioRepository.save(formulario);
        System.err.println("mi formulario" + formulario);
                return new ResponseEntity<>("Formulario submitted successfully", HttpStatus.CREATED);

    }

    public List<Formulario> getFormularios() {
        return (List<Formulario>) formularioRepository.findAll();
    }
}
