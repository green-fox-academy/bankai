package Animal;

public class Main {
    public static void main(String[] args) {
        Animal pinkBat = new Animal();
        Animal blueDog = new Animal();
        Animal purpleCat = new Animal();
        Animal Cerberus = new Animal();

        for (int i = 0; i < 20; i++) {
            pinkBat.drink();
            blueDog.drink();
            purpleCat.drink();
            Cerberus.drink();
        }
        for (int i = 0; i < 19; i++) {
            pinkBat.eat();
            blueDog.eat();
            purpleCat.eat();
            Cerberus.eat();
        }

        System.out.println(pinkBat);
        System.out.println(blueDog);
        System.out.println(purpleCat);
        System.out.println(Cerberus);
    }
}
