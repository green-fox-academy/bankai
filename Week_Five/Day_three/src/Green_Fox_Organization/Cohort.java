package Green_Fox_Organization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Green_Fox_Organization.Student> students;
    private List<Green_Fox_Organization.Mentor> mentors;

    public  Cohort(String name)  {
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addStudent(Green_Fox_Organization.Student student)  {
        students.add(student);
    }

    public void addMentor(Green_Fox_Organization.Mentor mentor)  {
        mentors.add(mentor);
    }

    public void info()  {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");

    }
}
