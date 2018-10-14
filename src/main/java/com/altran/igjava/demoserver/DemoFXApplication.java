package com.altran.igjava.demoserver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DemoFXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        root.getChildren().add(new Button("Hello"));

        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }
}