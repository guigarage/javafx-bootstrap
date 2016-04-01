package com.guigarage.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(new StackPane(new Label("Hello World!")));
        scene.getStylesheets().add(MyApplication.class.getResource("style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();
    }

    public void main(String... args) {
        launch(args);
    }
}
