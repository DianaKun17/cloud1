package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController {
    @FXML
    private Button authButton;

    @FXML
    private TextField fieldLogin;

    @FXML
    private PasswordField fieldPassword;
    private Network network;

    public void setNetwork(Network network) {
        this.network = network;
    }


}