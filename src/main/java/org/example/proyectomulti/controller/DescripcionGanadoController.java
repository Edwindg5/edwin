package org.example.proyectomulti.controller;
import org.example.proyectomulti.models.Ganado;
public class DescripcionGanadoController {
    // Método para mostrar información de un ganado
    public void mostrarInformacionGanado(Ganado ganado) {
        System.out.println("Nombre: " + ganado.getNombre());
        System.out.println("ID: " + ganado.getId());
        System.out.println("Peso: " + ganado.getPeso());
        System.out.println("Estado de Salud: " + ganado.getEstadoSalud());
        System.out.println("Raza: " + ganado.getRaza());
    }
}
