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
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author portia
 */
public class HomeController implements Initializable {
    @FXML private AnchorPane home_pane;
    
    @FXML
    private void onLoginClicked(ActionEvent event) throws IOException {
        home_pane.getChildren().clear();
        home_pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/login.fxml")));
    }
    
    @FXML
    private void onSignupClicked(ActionEvent event) throws IOException {
        home_pane.getChildren().clear();
        home_pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/signup.fxml")));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
