package Sharpie;

public class Main {

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("blue", 0.8f);
        Sharpie sharpie2 = new Sharpie("black", 0.75f);
        Sharpie sharpie3 = new Sharpie("red", 0.65f);

        for (int i = 0; i < 28; i++) {
            sharpie1.use();
            sharpie2.use();
            sharpie3.use();
        }

        System.out.println(sharpie1);
        System.out.println(sharpie2);
        System.out.println(sharpie3);
    }

}
