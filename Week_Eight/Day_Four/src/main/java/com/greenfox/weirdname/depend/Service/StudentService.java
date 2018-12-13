package com.greenfox.weirdname.depend.Service;
import com.greenfox.weirdname.depend.Service.StudentServiceInt;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements StudentServiceInt {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Paulo");
    names.add("James");
    names.add("Steph");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count() {
    return names.size();
  }

  public boolean check(String name) {
    return names.stream().anyMatch(name::equals);
  }

}

