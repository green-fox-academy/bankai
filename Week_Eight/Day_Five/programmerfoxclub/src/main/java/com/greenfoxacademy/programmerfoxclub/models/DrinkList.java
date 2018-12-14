package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class DrinkList {
  private String[] drinkList;

  public DrinkList() {
    drinkList = new String[]{"tears", "beer", "juice", "coffee", "blood"};
  }

  public String[] getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(String[] drinkList) {
    this.drinkList = drinkList;
  }
}
