package com.boshy.monyapp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @FXML
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("تجميع الايراد");
        Image icon = new Image(String.valueOf(getClass().getResource("icon.png")));
        ImageView wallpaperImage  = new ImageView(new Image(String.valueOf(getClass().getResource("ffflux.svg"))));
        AnchorPane MAP  = new AnchorPane();
        wallpaperImage.setFitWidth(MAP.getPrefWidth());
        wallpaperImage.setFitHeight(MAP.getPrefHeight());
        MAP.getChildren().add(0, wallpaperImage);
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}