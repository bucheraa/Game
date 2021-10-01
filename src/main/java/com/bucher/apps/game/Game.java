package com.bucher.apps.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        GameController controller = new GameController(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}