package com.bucher.apps.game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player extends Sprites {

    private double dx;
    private double dy;
    private double x = 40;
    private double y = 60;

    public Player() {
        final Image image = new Image(getClass().getResource("sprites/player.png").toString());
        sprite = new ImageView(image);
        setPlayerSize();
    }

    final private void setPlayerSize() {
        sprite.setFitHeight(40);
        sprite.setFitWidth(40);
    }

    public void move() {

    }
}
