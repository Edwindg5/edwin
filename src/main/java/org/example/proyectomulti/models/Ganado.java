package org.example.proyectomulti.models;

public class Ganado {
    private String nombre;
    private int id;
    private double peso;
    private String estadoSalud;
    private String raza;

    public Ganado(String nombre, int id, double peso, String estadoSalud, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.peso = peso;
        this.estadoSalud = estadoSalud;
        this.raza = raza;
    }
}
