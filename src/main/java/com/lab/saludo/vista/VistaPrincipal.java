package com.lab.saludo.vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Pantalla inicial del caso de uso «Solicitar saludo».
 * El estudiante inicia el flujo con el botón correspondiente.
 */
public class VistaPrincipal {

    private final Scene escena;
    private final Button botonSolicitarSaludo;

    public VistaPrincipal() {
        Label titulo = new Label("Sistema Saludador");
        titulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label instruccion = new Label("Haga clic en el botón para solicitar un saludo.");

        botonSolicitarSaludo = new Button("Solicitar saludo");
        botonSolicitarSaludo.setDefaultButton(true);

        VBox raiz = new VBox(16, titulo, instruccion, botonSolicitarSaludo);
        raiz.setAlignment(Pos.CENTER);
        raiz.setPadding(new Insets(32));

        escena = new Scene(raiz, 420, 240);
    }

    public Scene getEscena() {
        return escena;
    }

    public Button getBotonSolicitarSaludo() {
        return botonSolicitarSaludo;
    }
}
