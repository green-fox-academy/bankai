import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {
        int trianglePyramidSize = 20;

        for (int lineCount = 0; lineCount < trianglePyramidSize ; lineCount++) {
            for (int i = -lineCount ; i <=  lineCount ; i ++) {
                if (lineCount % 2 == 0 && i % 2 == 0 ) {
                    triangleDraw(lineCount, i , graphics);
                } else {
                    if (lineCount % 2 != 0 && i % 2 != 0) {
                        triangleDraw(lineCount, i , graphics);
                    }
                }
            }
        }
    }

    private static void triangleDraw(int lineCount, int i, Graphics graphics) {
        int xPoints[] = {300 +  i * 10, 290 + i * 10, 310 + i * 10};
        int yPoints[] = {lineCount * 17, lineCount * 17 + 17, lineCount * 17 + 17};
        int nPoints = 3;
        Random random = new Random();
        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        //graphics.setColor(Color.blue);
        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Triangle");
        jFrame.setSize(new Dimension(WIDTH + 20, HEIGHT + 25 ));
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

