package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class TrickList {

  private String[] trickList;

  public TrickList() {
    trickList = new String[]{"Deep faking", "Hackerman", "Teleport", "Ride a bike", "breathing Fire", "consuming Sailors", "coding Python", "fighting Darkseid", "storm making"};
  }

  public String[] getTrickList() {
    return trickList;
  }

  public void setTrickList(String[] trickList) {
    this.trickList = trickList;
  }
}
