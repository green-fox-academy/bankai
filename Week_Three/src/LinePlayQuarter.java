import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarter {
    public static void mainDraw(Graphics graphics) {
        int stepsSize = 5;
        int canvasDivide = 8;
        patternDrawer(stepsSize, canvasDivide, graphics);
    }
    private static void patternDrawer(int stepSize, int canvasDivide, Graphics graphics) {
        for (int canvasX = 0; canvasX < canvasDivide ; canvasX++) {
            for (int canvasY = 0; canvasY < canvasDivide ; canvasY++) {
                for (int i = 0; i <= WIDTH / stepSize / canvasDivide ; i++) {
                    lineDrawer(i, canvasX, canvasY, stepSize, canvasDivide, graphics);
                }
            }
        }
    }

    private static void lineDrawer(int i, int canvasX, int canvasY, int stepSize, int canvasDivide, Graphics graphics) {
        Random random = new Random();
        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        //graphics.setColor(Color.RED);
        graphics.drawLine(
                canvasX * HEIGHT / canvasDivide + i * stepSize,
                canvasY * HEIGHT / canvasDivide,
                HEIGHT / canvasDivide +  canvasX * (HEIGHT / canvasDivide),
                canvasY * HEIGHT / canvasDivide + i * stepSize
        );

        Random randomColor = new Random();
        graphics.setColor(new Color(randomColor.nextInt(256), randomColor.nextInt(256), randomColor.nextInt(256)));
        //graphics.setColor(Color.GREEN);
        graphics.drawLine(
                canvasX * HEIGHT / canvasDivide,
                canvasY * HEIGHT / canvasDivide + i * stepSize,
                canvasX * HEIGHT / canvasDivide + i * stepSize,
                HEIGHT / canvasDivide +  canvasY * (HEIGHT / canvasDivide)

        );
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("LinePlayQuarter");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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
