package org.example.proyectomulti.controller;

import org.example.proyectomulti.models.VacaPremiada;

public class RegistroVacasPremiadasController {
    // Método para registrar vaca premiada
    public void registrarVacaPremiada(String nombre, int id, double peso, String estadoSalud, String raza, String fechaPremiacion) {
        VacaPremiada vacaPremiada = new VacaPremiada(nombre, id, peso, estadoSalud, raza, fechaPremiacion);
        // Lógica para almacenar la vaca premiada, por ejemplo, en una lista o base de datos
    }
}