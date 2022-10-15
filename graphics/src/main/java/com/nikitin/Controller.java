package com.nikitin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;


    @FXML
    void sendMsg() {
        textArea.appendText(" " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }


    public void Open(ActionEvent actionEvent) {
        Button button=new Button("Вход");

    }

    public void About(ActionEvent actionEvent) {
        Button button=new Button("About");
        System.out.println("Сетевой чат GeekBrains v0.1");
    }

    public void Close(ActionEvent actionEvent) {
        Button button=new Button("Выход");

    }
}

