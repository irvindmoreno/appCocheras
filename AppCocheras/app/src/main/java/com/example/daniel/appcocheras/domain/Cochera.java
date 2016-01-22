package com.example.daniel.appcocheras.domain;

/**
 * Created by daniel on 18/01/16.
 */
public class Cochera {
    String name;
    String direccion;
    String fecha;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public Cochera(String name, String direccion, String fecha) {
        this.name = name;
        this.direccion = direccion;
        this.fecha = fecha;
    }
}