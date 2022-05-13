package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentListController implements Initializable {
    public TableView<Student> tbview;
    public TableColumn<Student, Integer> sEnrollID;
    public TableColumn<Student, String> sFirstName;
    public TableColumn<Student, String> sLastName;
    public TableColumn<Student, Integer> sAge;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       sEnrollID.setCellValueFactory(new PropertyValueFactory<>("EnrollID"));
       sFirstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
       sLastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
       sAge.setCellValueFactory(new PropertyValueFactory<>("Age"));
    }

    public void backToMenu(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
