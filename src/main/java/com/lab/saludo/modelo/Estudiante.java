package com.lab.saludo.modelo;

/**
 * Datos del actor Estudiante recolectados en el caso de uso «Pedir datos».
 * La hora (AM/PM) se solicita, pero no se usa en el saludo.
 */
public class Estudiante {

    private final String nombre;
    private final int edad;
    private final String hora; // AM o PM; se almacena aunque no se muestre

    public Estudiante(String nombre, int edad, String hora) {
        this.nombre = nombre;
        this.edad = edad;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHora() {
        return hora;
    }
}
