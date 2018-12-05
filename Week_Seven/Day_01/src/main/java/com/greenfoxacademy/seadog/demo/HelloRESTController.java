package com.greenfoxacademy.seadog.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping("/greetings")
  public Greetings greetings(@RequestParam String name) {
    return new Greetings("Mazel tov! "  + name);
  }

}
