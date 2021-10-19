package ru.mirea.task11.mouseevent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainForm.class.getResource("main-form.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("MouseEvent");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch();
    }
}