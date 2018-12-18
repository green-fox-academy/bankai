package com.greenfoxacademy.connectionmysql;

import com.greenfoxacademy.connectionmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionmysqlApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//
//  }

}

