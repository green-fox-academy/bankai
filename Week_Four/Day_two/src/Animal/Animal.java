package Animal;

public class Animal {
    int hunger;
    int thirst;

    @Override
    public String toString() {
        return "Animal{" +
                "hunger = " + hunger +
                ", thirst = " + thirst +
                '}';
    }

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public static void play(Animal animal) {
        animal.hunger++;
        animal.thirst++;
    }
}
