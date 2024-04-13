package org.example.proyectomulti.controller;

import org.example.proyectomulti.models.Animal;

import java.util.List;

public class EliminarGanadoController {
    // Método para eliminar ganado de la lista
    public void eliminarGanado(List<Animal> listaGanado, int id) {
        for (Animal ganado : listaGanado) {
            if (ganado.getId() == id) {
                listaGanado.remove(ganado);
                System.out.println("Baja exitosa");
                return;
            }
        }
        System.out.println("No se encontró el ganado con el ID especificado");
    }
}