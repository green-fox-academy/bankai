import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        drawLineToCenter(graphics);


    }

    public static void drawLineToCenter(Graphics graphics) {

        for (int i = 0; i < 3 ; i++) {
            Random random = new Random();
            int inputCoordinateX = random.nextInt(600);
            int inputCoordinateY = random.nextInt(600);
            graphics.setColor(new Color((random.nextInt(256)),(random.nextInt(256)), (random.nextInt(256))));
            graphics.drawLine(inputCoordinateX, inputCoordinateY, WIDTH / 2, HEIGHT / 2);
        }
        /*for (int i = 0; i < 100; i++);{
            Random center = new Random();
            int inputCoordinateX = center.nextInt(600);
            int inputCoordinateY = center.nextInt(600);
            graphics.setColor(new Color((center.nextInt(256)),(center.nextInt(256)), (center.nextInt(256))));
            graphics.drawLine(inputCoordinateX, inputCoordinateY, WIDTH / 2, HEIGHT / 2);
        }*/

    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GoToCenter");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}