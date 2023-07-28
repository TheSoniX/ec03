package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "instrumento")
public class Instrumento {
    
    private int id;
    private String nombre;
    private int id_categoria;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    
}
