package com;

import com.objects.Snake;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tatus on 24.01.2017.
 */
public class SGMain extends JPanel implements ActionListener {

    public  static JFrame jFrame;

    public  static final int SCALE = 32;
    public  static final int WIDTH = 20;
    public  static final int HEIGHT = 20;
    public  static int speed = 10 ;
    Snake s = new Snake(5,6,5,5);

    Timer timer = new Timer(1000/speed,this);

    public SGMain(){
        timer.start();
    }

    public  void  paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH*SCALE,HEIGHT*SCALE);

        for (int x = 0;  x < WIDTH*SCALE; x+=SCALE){
            g.setColor(Color.white);
            g.drawLine(x ,0, x, HEIGHT*SCALE);
        }
        for (int y = 0;  y < HEIGHT*SCALE; y+=SCALE){
            g.setColor(Color.white);
            g.drawLine(0 ,y, WIDTH*SCALE, y);
        }

        for (int l = 0; l<s.lenght; l++){
            g.setColor(Color.red);
            g.fillRect(s.sX[l]*SCALE+2,s.sY[l]*SCALE+1, SCALE-1, SCALE-1 );
        }

    }

    public static void main(String[] args) {

        jFrame = new JFrame("Title");
        jFrame.setSize(WIDTH*SCALE+6,HEIGHT*SCALE+28);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);

        jFrame.add(new SGMain());
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s.move();
        repaint();
    }
}
