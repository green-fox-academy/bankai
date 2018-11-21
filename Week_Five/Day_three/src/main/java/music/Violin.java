package main.java.music;

public class Violin extends StringedInstrument {
    public Violin(){
        super.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings){
        super.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Violin, a " + numberOfStrings + " instrument that goes " + this.sound());
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
