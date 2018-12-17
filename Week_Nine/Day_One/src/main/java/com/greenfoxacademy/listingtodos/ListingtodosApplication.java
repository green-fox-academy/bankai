package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

  TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  @Autowired
  public ListingtodosApplication(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Make investment plan for next year"));
    repository.save(new Todo("Increase RAM size by first week of January"));
    repository.save(new Todo("Complete Python tutorials and start Kaggle exercises"));
    repository.save(new Todo("Build database for pharmacy inventory"));

  }
}

