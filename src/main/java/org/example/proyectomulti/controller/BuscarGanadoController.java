package org.example.proyectomulti.controller;
import org.example.proyectomulti.models.Ganado;
import java.util.List;

public class BuscarGanadoController {
    // Método para buscar ganado por nombre
    public Ganado buscarPorNombre(List<Ganado> listaGanado, String nombre) {
        for (Ganado ganado : listaGanado) {
            if (ganado.getNombre().equals(nombre)) {
                return ganado;
            }
        }
        return null;
    }
    // Método para buscar ganado por ID
    public Ganado buscarPorId(List<Ganado> listaGanado, int id) {
        for (Ganado ganado : listaGanado) {
            if (ganado.getId() == id) {
                return ganado;
            }
        }
        return null;
    }

    // Otros métodos de búsqueda según necesidades
}