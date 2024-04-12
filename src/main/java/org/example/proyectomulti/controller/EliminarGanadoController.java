package org.example.proyectomulti.controller;

import org.example.proyectomulti.models.Ganado;

import java.util.List;

public class EliminarGanadoController {
    // Método para eliminar ganado de la lista
    public void eliminarGanado(List<Ganado> listaGanado, int id) {
        for (Ganado ganado : listaGanado) {
            if (ganado.getId() == id) {
                listaGanado.remove(ganado);
                System.out.println("Baja exitosa");
                return;
            }
        }
        System.out.println("No se encontró el ganado con el ID especificado");
    }
}