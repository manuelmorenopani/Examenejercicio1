package com.example.examenejercicio1.modelo;

public class Producto {





    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int modelo) {
        this.precio = precio;
    }

    String nombre;
    int precio;
}
