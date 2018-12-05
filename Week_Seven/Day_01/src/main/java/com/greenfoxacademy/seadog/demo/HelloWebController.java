package com.greenfoxacademy.seadog.demo;

import java.util.Objects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    Greetings greetings = new Greetings("count");
    model.addAttribute("name", greetings.getContent());
    String countNo = Objects.toString(greetings.getId(), null);
    model.addAttribute("count", countNo);
    //model.addAttribute("randomGreeting", greetings.HelloMany());
    return "greeting";
  }

}
