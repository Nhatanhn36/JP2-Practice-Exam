package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeController {
    public void addStudent(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FormStudent.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void save(ActionEvent event) throws Exception{
        
    }

    public void viewListStudent(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ListStudent.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void Exit(ActionEvent event) throws Exception{
        System.exit(0);
    }
}
