import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            System.out.println("Please type in two numbers:");
            int x = (int) (Math.random() *320);
            int y = (int) (Math.random() *320);
            /*int coordinateX = scanner.nextInt();
            int coordinateY = scanner.nextInt();*/
            //drawHorizontalLines(coordinateX, coordinateY, graphics);
            drawHorizontalLines(x, y, graphics);
        }


    }
    public static void drawHorizontalLines (int x, int y, Graphics graphics) {
    //public static void drawHorizontalLines (int coordinateX, int coordinateY, Graphics graphics) {
        Random random = new Random();
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x, y, x + 50, y );
        //graphics.drawLine(coordinateX, coordinateY, coordinateX + 50, coordinateY );
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("HorizontalLines");
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