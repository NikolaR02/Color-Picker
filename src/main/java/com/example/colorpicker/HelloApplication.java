package com.example.colorpicker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        // declaración de los elementos. Un campo de texto y el elemento ColorPicker
        Label l = new Label("no hay color elegido ");
        l.setStyle("-fx-background-color: #e6e6e6;");
        ColorPicker colorPicker = new ColorPicker();

        // los elementos estructorados en HBox y VBox
        HBox hBox = new HBox(colorPicker);
        HBox hBox1 = new HBox(l);
        VBox vBox = new VBox(hBox,hBox1);
        vBox.setPadding(new Insets(100, 100, 100, 100));
        Scene scene = new Scene(vBox, 400, 300);

        // acción al elegir el color
        colorPicker.setOnAction(t -> {
            l.setText("Color elegido en hex: " + colorPicker.getValue());
            vBox.setStyle("-fx-background-color: #" + colorPicker.getValue().toString().substring(2) + ";");
        });

        // escena
        stage.setTitle("Color Picker App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}