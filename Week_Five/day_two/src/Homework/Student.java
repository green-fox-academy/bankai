package Homework;

public class Student {

    String name;
    String classroom;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student() {
        name = "James";
        age = 30;
        gender = "male";
        previousOrganization = "Smosh Games";
        skippedDays = 0;
    }
    public Student(String name, int age, String gender, String previousOrganization)  {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }
    public void getGoal() {
        System.out.println("Be a junior developer");
    }
    public void introduce()  {
        System.out.println( "Hi, I'm " + name + " a " + "year old " + gender + " from " + previousOrganization
                + " who skipped " + skippedDays + " days from the course already.");
    }
    public void skipDays(int numberOfDays)  {
        skippedDays += numberOfDays;
    }
}
