package com.lab.saludo;

import com.lab.saludo.controlador.SaludadorControlador;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Punto de entrada de la aplicación de escritorio «Saludador».
 * Actor: Estudiante. Caso de uso principal: «Solicitar saludo»
 * (incluye «Pedir datos»).
 */
public class App extends Application {

    @Override
    public void start(Stage escenario) {
        escenario.setTitle("Saludador");
        escenario.setResizable(false);

        SaludadorControlador controlador = new SaludadorControlador(escenario);
        controlador.mostrarPantallaInicial();

        escenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
