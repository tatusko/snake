package com.objects;

import com.SGMain;

/**
 * Created by tatus on 24.01.2017.
 */
public class Apple {
    public int posX;
    public int posY;

    public Apple(int x, int y) {
        posX = x;
        posY = y;
    }


    public void setRandomPosition(){
        posX = Math.abs((int) (Math.random() * SGMain.WIDTH - 1));
        posY = Math.abs((int) (Math.random() * SGMain.HEIGHT - 1));
    }
}
