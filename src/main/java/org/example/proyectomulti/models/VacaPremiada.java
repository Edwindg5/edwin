package org.example.proyectomulti.models;

public class VacaPremiada extends Ganado {
    private String fechaPremiacion;

    // Constructor
    public VacaPremiada(String nombre, int id, double peso, String estadoSalud, String raza, String fechaPremiacion) {
        super(nombre, id, peso, estadoSalud, raza);
        this.fechaPremiacion = fechaPremiacion;
    }

    // Getters y setters específicos para la clase VacaPremiada

    public String getFechaPremiacion() {
        return fechaPremiacion;
    }

    public void setFechaPremiacion(String fechaPremiacion) {
        this.fechaPremiacion = fechaPremiacion;
    }
}
