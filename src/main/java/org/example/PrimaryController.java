package org.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
 // 22.44
    public TextField cNametxt;
    public TextField cAgetxt;
    public TextField cNumbertxt;
    public ArrayList<Contact> contacts = new ArrayList<>();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    public void initialize(){

    }

    public void saveBtn(ActionEvent actionEvent) {
    }
}
