package org.example.proyectomulti.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {

    @FXML
    private TextField usuarioField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private void login() {
        String usuario = usuarioField.getText();
        String contrasena = contrasenaField.getText();

        if (usuario.equals("2edwin") && contrasena.equals("123")) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            mostrarAlerta("Error de inicio de sesión", "Usuario o contraseña incorrectos.");
        }
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}