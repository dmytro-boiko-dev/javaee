package gamefx;

import gamefx.objects.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeMain extends JPanel implements ActionListener {

    public static JFrame jFrame;

    public static final int SCALE = 32; // размер клетки в пикеслях
    public static final int WIDTH = 20; // размер поля в клетках
    public static final int HEIGHT = 20; // размер поля в клетках
    public static int speed = 10;

    Snake snake = new Snake(5, 6, 5, 5);
    Timer timer = new Timer(1000/ speed, this);


    public SnakeMain(){
        timer.start();
    }

    public void paint (Graphics graphics) {

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);


        for (int x = 0; x < WIDTH * SCALE; x = x + SCALE) {
            graphics.setColor(Color.GRAY);
            graphics.drawLine(x, 0, x, HEIGHT * SCALE);
        }

        for (int y = 0; y < HEIGHT * SCALE; y = y + SCALE) {
            graphics.setColor(Color.GRAY);
            graphics.drawLine(0, y, WIDTH * SCALE, y);
        }

        for (int i = 0; i < snake.length; i++) {
            graphics.setColor(Color.GREEN);
            graphics.fillRect(snake.snakeX[i] * SCALE + 1, snake.snakeY[i] * SCALE + 1, SCALE -1, SCALE -1);
        }

    }


    public static void main(String[] args) {

        jFrame = new JFrame("Snake Game");

        jFrame.setSize(WIDTH * SCALE + 7, HEIGHT * SCALE + 30);

        jFrame.setLocationRelativeTo(null);

        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setResizable(false);

        jFrame.add(new SnakeMain());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        snake.move();
        repaint();
    }
}
