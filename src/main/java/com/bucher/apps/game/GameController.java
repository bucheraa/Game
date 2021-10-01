package com.bucher.apps.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController {

    private Scene scene;
    private Stage stage;

    @FXML
    MenuItem miNew;
    @FXML
    VBox vbox;

    public GameController(final Stage stage) throws IOException {
        this.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource("Game.fxml"));
        fxmlLoader.setController(this);
        Parent root = fxmlLoader.load();
        scene = new Scene(root, 500, 440);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        Player player = new Player();
        vbox.getChildren().add(player.getSprite());
    }

    public void setStage(final Stage stage) {
        this.stage = stage;
    }

    public void setScene(final Scene scene) {
        this.scene = scene;
    }

    @FXML
    public void initialize() {
        System.out.println("init");
        if(scene != null) {
            this.scene.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.A) {
                    System.out.println("Right");
                }
            });
        }
    }
}