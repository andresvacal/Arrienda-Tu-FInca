package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Resena {
    @Id
    private Long idresena;
    private Integer valorresena;
    private String textoresena;

    public Resena() {
    }
}
