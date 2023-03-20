/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.*;

/**
 *
 * @author portia
 */
public class LoginController implements Initializable {
    @FXML private AnchorPane login_pane;
    @FXML private TextField txt_username;
    @FXML private TextField txt_password;
    @FXML private Label lbl_error;
    
    @FXML
    private void btnLoginClicked(MouseEvent event) throws IOException {
        String username = txt_username.getText();
        String password = txt_password.getText();
        
        Library library = Library.getInstance();
        
        if(!library.login(username)){
            lbl_error.setText("Invalid login credentials.");
            return;
        }
        
        switchScreen();
    }
    
    private void switchScreen() throws IOException {
        login_pane.getChildren().clear();
        login_pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/user_home.fxml")));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
