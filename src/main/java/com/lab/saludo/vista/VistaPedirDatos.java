package com.lab.saludo.vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * Caso de uso incluido «Pedir datos»:
 * solicita nombre, edad y hora (AM/PM) mediante campos de texto.
 */
public class VistaPedirDatos {

    private final Scene escena;
    private final TextField campoNombre;
    private final TextField campoEdad;
    private final TextField campoHora;
    private final Button botonAceptar;
    private final Label etiquetaMensaje;

    public VistaPedirDatos() {
        Label titulo = new Label("Pedir datos");
        titulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        campoNombre = new TextField();
        campoNombre.setPromptText("Escriba su nombre");

        campoEdad = new TextField();
        campoEdad.setPromptText("Escriba su edad");

        campoHora = new TextField();
        campoHora.setPromptText("AM o PM");

        botonAceptar = new Button("Aceptar");
        botonAceptar.setDefaultButton(true);

        etiquetaMensaje = new Label("");
        etiquetaMensaje.setWrapText(true);

        GridPane formulario = new GridPane();
        formulario.setHgap(10);
        formulario.setVgap(12);
        formulario.addRow(0, new Label("Nombre:"), campoNombre);
        formulario.addRow(1, new Label("Edad:"), campoEdad);
        formulario.addRow(2, new Label("Hora (AM/PM):"), campoHora);

        VBox raiz = new VBox(16, titulo, formulario, botonAceptar, etiquetaMensaje);
        raiz.setAlignment(Pos.CENTER);
        raiz.setPadding(new Insets(32));

        escena = new Scene(raiz, 420, 280);
    }

    public Scene getEscena() {
        return escena;
    }

    public TextField getCampoNombre() {
        return campoNombre;
    }

    public TextField getCampoEdad() {
        return campoEdad;
    }

    public TextField getCampoHora() {
        return campoHora;
    }

    public Button getBotonAceptar() {
        return botonAceptar;
    }

    public Label getEtiquetaMensaje() {
        return etiquetaMensaje;
    }
}
