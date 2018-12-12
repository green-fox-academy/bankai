package com.example.demo;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }
}
