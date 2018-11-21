package main.java.animals;

public abstract class Animal {

    private String name;
    int age;
    String gender;
    int leg;

    public Animal(String name)  {
        this.name = name;
    }

    public abstract String breed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
