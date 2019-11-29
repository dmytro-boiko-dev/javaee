package com.snakefx;

import com.snakefx.objects.Apple;
import com.snakefx.objects.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeFXMain extends JPanel implements ActionListener {

    public static JFrame jFrame;
    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    public static int speed = 10;

    Snake s = new Snake(5, 6, 5, 5);
    Apple apple = new Apple(Math.abs((int) (Math.random() * SnakeFXMain.WIDTH - 1)), Math.abs((int) (Math.random() * SnakeFXMain.HEIGHT - 1)));
    Timer timer = new Timer(1000 / speed, this);

    public SnakeFXMain() {
        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);

        for (int x = 0; x < WIDTH * SCALE; x = x + SCALE) {
            g.setColor(Color.WHITE);
            g.drawLine(x, 0, x, HEIGHT * SCALE);
        }
        for (int y = 0; y < HEIGHT * SCALE; y = y + SCALE) {
            g.setColor(Color.WHITE);
            g.drawLine(0, y, WIDTH * SCALE, y);
        }

        g.setColor(Color.RED);
        g.fillOval(apple.posX * SCALE + 4, apple.posY * SCALE + 4, SCALE - 8, SCALE - 8);

        for (int l = 0; l < s.length; l++) {
            g.setColor(Color.GREEN);
            g.fillRect(s.snakeX[l] * SCALE + 3, s.snakeY[l] * SCALE + 1, SCALE - 6, SCALE - 6);

            g.setColor(Color.WHITE);
            g.fillRect(s.snakeX[0] * SCALE + 3, s.snakeY[0] * SCALE + 1, SCALE - 6, SCALE - 6);
        }
    }

    public static void main(String[] args) {

        jFrame = new JFrame("SnakeFX");
        jFrame.setSize(WIDTH * SCALE + 7, HEIGHT * SCALE + 29);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(new SnakeFXMain());
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s.move();
        if ((s.snakeX[0] == apple.posX) && (s.snakeY[0] == apple.posY)) {
            apple.setDandomPosition();
            s.length++;
        }

        for (int l = 1; l < s.length; l++) {
            if ((s.snakeX[l] == apple.posX) && (s.snakeY[l] == apple.posY)) {
                apple.setDandomPosition();
            }
            //случай когда игра заканчивается
            if ((s.snakeX[0] == s.snakeX[l]) && (s.snakeY[0] == s.snakeY[l])) {

                timer.stop();
                JOptionPane.showMessageDialog(null, "Вы проиграли, зачать заново?");
                jFrame.setVisible(false);
                s.length = 2;
                s.direction = 0;
                apple.setDandomPosition();
                jFrame.setVisible(true);
                timer.start();
            }
        }
        repaint();
    }

    public class KeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent event) {

            int key = event.getKeyCode();

            if ((key == KeyEvent.VK_UP) && (s.direction != 2)) s.direction = 0;
            if ((key == KeyEvent.VK_DOWN) && (s.direction != 0)) s.direction = 2;
            if ((key == KeyEvent.VK_LEFT) && (s.direction != 1)) s.direction = 3;
            if ((key == KeyEvent.VK_RIGHT) && (s.direction != 3)) s.direction = 1;
        }
    }
}
