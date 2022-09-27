package com.example.colorpicker;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label l = new Label("no selected color ");



        stage.setTitle("Color Picker App");

        ColorPicker colorPicker = new ColorPicker();
        HBox hBox = new HBox(colorPicker);
        HBox hBox1 = new HBox(l);
        VBox vBox = new VBox(hBox,hBox1);
        vBox.setPadding(new Insets(150, 100, 150, 100));

        Scene scene = new Scene(vBox, 600, 400);

        colorPicker.setOnAction(new EventHandler() {
            public void handle(Event t) {
                l.setText("Color elegido: " + colorPicker.getValue());
                //vBox.setStyle("-fx-background-color: " + colorPicker.getValue() + ";");
            }
        });


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}