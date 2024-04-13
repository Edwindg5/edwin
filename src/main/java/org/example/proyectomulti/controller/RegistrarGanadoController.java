package org.example.proyectomulti.controller;

import org.example.proyectomulti.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class RegistrarGanadoController {
    private List<Animal> listaGanado;

    // Constructor
    public RegistrarGanadoController() {
        this.listaGanado = new ArrayList<>();
    }

    // Método para agregar ganado
    public void agregarGanado(String nombre, int id, double peso, String estadoSalud, String raza) {
        Animal ganado = new Animal(nombre, id, peso, estadoSalud, raza);
        listaGanado.add(ganado);
    }

    // Otros métodos según requerimientos
}
