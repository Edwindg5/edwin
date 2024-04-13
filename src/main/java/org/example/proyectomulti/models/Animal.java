package org.example.proyectomulti.models;

public class Animal {
    private String nombre;
    private int id;
    private double peso;
    private String estadoSalud;
    private String raza;

    // Constructor
    public Animal(String nombre, int id, double peso, String estadoSalud, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.peso = peso;
        this.estadoSalud = estadoSalud;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPeso() {
        return null;
    }

    // Getters y setters
    // (Métodos para obtener y establecer los atributos)

    // Métodos adicionales según necesidades

}