package main.java.animals;


import main.java.flyable.flyable;

public class Bird extends Animal implements flyable {
    public Bird(String name) {
        super( name );
    }

    @Override
    public String breed() {
        return "laying egg";
    }


    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
