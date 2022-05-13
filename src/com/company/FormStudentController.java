package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.sql.Date;

public class FormStudentController {
    public TextField sEnrollID;
    public TextField sFirstName;
    public TextField sLastName;
    public TextField sAge;
    
    public void add(ActionEvent event) {
        String EnrollID = this.sEnrollID.getText();
        String FirstName = this.sFirstName.getText();
        String LastName = this.sLastName.getText();
        String Age = this.sAge.getText();
        
        
    }

    public void backToMenu(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    
}
