package Green_Fox_Organization;

public class Student extends Person {
    private String previousOrganization;
    public int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super( name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    public Student()  {
        this.previousOrganization = "The Protector of the Deep";
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() +
                " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skippedDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

}
