package com.objects;

import com.SGMain;

/**
 * Created by tatus on 24.01.2017.
 */
public class Snake {
    public int lenght = 2;
    public int direction = 2;

    public int sX[] = new int[300];
    public int sY[] = new int[300];

    public Snake(int x1, int y1, int x2, int y2) {
        sX[0] = x1;
        sX[1] = x2;
        sY[0] = y1;
        sY[1] = y2;

    }

    public void  move(){

        for (int l = lenght; l > 0; l--){
            sX[l] = sX[l-1];
            sY[l] = sY[l-1];

        }
        if (direction == 0) sY[0]--;

        if (direction == 2) sY[0]++;

        if (direction == 1) sX[0]++;

        if (direction == 3) sX[0]--;

        if (sX[0]> SGMain.WIDTH -1 ) sX[0] = 0;
        if (sX[0]< 0 ) sX[0] = SGMain.WIDTH - 1;

        if (sY[0]> SGMain.HEIGHT -1 ) sY[0] = 0;
        if (sY[0]< 0 ) sY[0] = SGMain.HEIGHT - 1;

    }
}
