package com;

import javax.swing.*;

/**
 * Created by tatus on 24.01.2017.
 */
public class SGMain extends JPanel {

    public  static JFrame jFrame;

    public static void main(String[] args) {

        jFrame = new JFrame("Title");
        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
