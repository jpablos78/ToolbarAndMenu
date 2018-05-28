package com.example.jpablos.toolbarandmenu;

public class Opciones {
    private int orden;
    private String nombre;

    public Opciones(int orden, String nombre) {
        this.orden = orden;
        this.nombre = nombre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
