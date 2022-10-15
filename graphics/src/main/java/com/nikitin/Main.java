package com.nikitin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sample.fxml"));
        stage.setTitle("GeekBrainsChat");
        stage.setScene(new Scene(fxmlLoader.load(),600,475));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}