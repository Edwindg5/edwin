package org.example.proyectomulti.controller;

import org.example.proyectomulti.models.Ganado;

import java.util.ArrayList;
import java.util.List;

public class AgregarGanadoController {
    private List<Ganado> listaGanado;

    // Constructor
    public AgregarGanadoController() {
        this.listaGanado = new ArrayList<>();
    }

    // Método para agregar ganado
    public void agregarGanado(String nombre, int id, double peso, String estadoSalud, String raza) {
        Ganado ganado = new Ganado(nombre, id, peso, estadoSalud, raza);
        listaGanado.add(ganado);
    }

    // Otros métodos según requerimientos
}
