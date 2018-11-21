package Green_Fox_Organization;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("Alucard", 320, "male", "halfhuman");
        people.add(john);
        Student johnClone = new Student( "John", 20, "male", "BME" );
        people.add( johnClone );
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Dracula", 548, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor hans = new Sponsor("Beelzebub", 5046, "male", "Hades");
        people.add(hans);

        student.skippedDays(3);

        for (int i = 0; i < 5; i++) {
            hans.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("Little Vampire Cubs");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();

        try{
            john.clone();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

}
