package com.snakefx.objects;

import com.snakefx.SnakeFXMain;

public class Apple {

    public int posY;
    public int posX;

    public Apple(int x, int y) {
        posX = x;
        posY = y;
    }

    public void setDandomPosition() {
        posX = Math.abs((int) (Math.random() * SnakeFXMain.WIDTH - 1));
        posY = Math.abs((int) (Math.random() * SnakeFXMain.HEIGHT - 1));
    }
}
