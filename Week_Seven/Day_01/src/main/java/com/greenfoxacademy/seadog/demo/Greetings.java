package com.greenfoxacademy.seadog.demo;

import java.util.concurrent.atomic.AtomicLong;

public class Greetings {
  long id;
  String content;
  static AtomicLong bose = new AtomicLong(1);

  public Greetings(String content) {
    this.id = bose.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
