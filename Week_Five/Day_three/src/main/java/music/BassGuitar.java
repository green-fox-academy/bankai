package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        super.numberOfStrings = 4;
    }
    @Override
    public String sound() {
        return  "Duum-duum-duum";
    }

    public BassGuitar(int numberOfStrings) {
        super.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Bass Guitar, a " + numberOfStrings + " that goes " + this.sound());
    }
}
