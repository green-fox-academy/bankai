import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int stepsSize = 20;
        int canvasDivide = 2;
        patternDrawer(stepsSize, canvasDivide, graphics);
    }

    private static void patternDrawer(int stepSize, int canvasDivide, Graphics graphics) {
        for (int i = 1; i < WIDTH / stepSize / canvasDivide ; i++) {
            lineDrawer(i, stepSize, canvasDivide, graphics);
        }
    }

    private static void lineDrawer(int i, int stepSize, int canvasDivide, Graphics graphics) {
        Random random = new Random();
        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        //graphics.setColor(Color.RED);
        graphics.drawLine(  WIDTH / canvasDivide,
                i * stepSize,
                WIDTH / canvasDivide - (i * stepSize),
                WIDTH / canvasDivide);

        graphics.drawLine(  WIDTH / canvasDivide,
                i * stepSize,
                WIDTH / canvasDivide + (i * stepSize),
                WIDTH / canvasDivide);

        graphics.drawLine(  i * stepSize,
                WIDTH / canvasDivide,
                WIDTH / canvasDivide,
                WIDTH / canvasDivide + (i * stepSize));

        graphics.drawLine(  WIDTH / canvasDivide + i * stepSize,
                WIDTH / canvasDivide,
                WIDTH / canvasDivide,
                WIDTH - (i * stepSize));
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("EnvelopeStar");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT ));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}