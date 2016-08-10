package com.guigarage.app;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(getRootNode());
        addStylesheet(scene);

        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();
    }

    private void addStylesheet(Scene scene) {
        scene.getStylesheets().add(MyApplication.class.getResource("style.css").toExternalForm());
    }

    private Parent getRootNode() {
        return new StackPane(new Label("Hello World!"));
    }

    public static void main(String... args) {
        launch(args);
    }
}
