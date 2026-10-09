package com.lab.saludo.controlador;

import com.lab.saludo.modelo.Estudiante;
import com.lab.saludo.vista.VistaPedirDatos;
import com.lab.saludo.vista.VistaPrincipal;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Orquesta el flujo «Solicitar saludo» e incluye «Pedir datos».
 *
 * Pasos:
 * 1) El estudiante hace clic en «Solicitar saludo».
 * 2) El sistema pide nombre, edad y hora (AM/PM).
 * 3) El estudiante ingresa los datos y acepta.
 * 4) El sistema saluda por nombre y menciona la edad.
 *    La hora se pide, pero no se usa en el saludo.
 */
public class SaludadorControlador {

    private final Stage escenario;

    public SaludadorControlador(Stage escenario) {
        this.escenario = escenario;
    }

    /** Muestra la pantalla inicial del caso de uso principal. */
    public void mostrarPantallaInicial() {
        VistaPrincipal vista = new VistaPrincipal();
        // Paso 1: el clic dispara el caso de uso incluido «Pedir datos».
        vista.getBotonSolicitarSaludo().setOnAction(evento -> pedirDatos());
        escenario.setScene(vista.getEscena());
    }

    /** Incluye el caso de uso «Pedir datos». */
    private void pedirDatos() {
        VistaPedirDatos vista = new VistaPedirDatos();
        vista.getBotonAceptar().setOnAction(evento -> {
            String nombre = vista.getCampoNombre().getText().trim();
            String edadTexto = vista.getCampoEdad().getText().trim();
            String hora = vista.getCampoHora().getText().trim();

            if (nombre.isEmpty() || edadTexto.isEmpty() || hora.isEmpty()) {
                vista.getEtiquetaMensaje().setText("Complete nombre, edad y hora (AM/PM).");
                return;
            }

            int edad;
            try {
                edad = Integer.parseInt(edadTexto);
            } catch (NumberFormatException excepcion) {
                vista.getEtiquetaMensaje().setText("La edad debe ser un número entero.");
                return;
            }

            if (edad < 0) {
                vista.getEtiquetaMensaje().setText("La edad no puede ser negativa.");
                return;
            }

            Estudiante estudiante = new Estudiante(nombre, edad, hora);
            mostrarSaludo(estudiante);
        });
        escenario.setScene(vista.getEscena());
    }

    /**
     * Paso 4: saluda al estudiante. La hora queda en el modelo
     * pero no forma parte del mensaje.
     */
    private void mostrarSaludo(Estudiante estudiante) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Saludo");
        alerta.setHeaderText("Solicitar saludo");
        alerta.setContentText(
                "Hola, " + estudiante.getNombre()
                        + ". Tienes " + estudiante.getEdad() + " años.");
        alerta.showAndWait();
        mostrarPantallaInicial();
    }
}
