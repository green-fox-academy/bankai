package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class FoodList {
  private String[] foodlist;

  public FoodList() {
    foodlist = new String[]{"ambrosia", "fonio", "hamburger", "sushi", "sausage", "gulash", "salad", "souls of sailors"};
  }

  public String[] getFoodlist() {
    return foodlist;
  }

  public void setFoodlist(String[] foodlist) {
    this.foodlist = foodlist;
  }
}
