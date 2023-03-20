/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.*;

/**
 *
 * @author portia
 */
public class UserHomeController implements Initializable {
    @FXML private Label lbl_title;
    @FXML private ListView lst_books;
    @FXML private Label lbl_book_title;
    @FXML private Label lbl_book_author;
    @FXML private ImageView img_book;
    private Library library;
    private User user;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        library = Library.getInstance();
        user = library.getCurrentUser();
        
        lbl_title.setText("Welcome " + user.getFirstName() + " " + user.getLastName());
        
        displayUserItems();
    }   
    
    private void displayUserItems(){
        ObservableList<String> book_list =FXCollections.observableArrayList ();
        
        for(Item item : user.getItems()){
            book_list.add(item.getTitle());
        }
        
        lst_books.setItems(book_list);
    }
    
    @FXML
    private void bookItemClicked(MouseEvent event) throws IOException  {
        String bookName = lst_books.getSelectionModel().getSelectedItem().toString();
        
        for(Item item : user.getItems()){
            if(item.getTitle().equalsIgnoreCase(bookName)){
                lbl_book_title.setText(item.getTitle());
                lbl_book_author.setText(item.getAuthor());
                //Image image = new Image(getClass().getResourceAsStream(item.getImageName()));
                Image image = new Image(getClass().getResourceAsStream("/images/" + item.getImageName()));
                img_book.setImage(image);
            }
        }
    }
}
