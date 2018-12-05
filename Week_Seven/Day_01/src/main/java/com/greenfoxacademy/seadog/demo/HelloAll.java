package com.greenfoxacademy.seadog.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloAll {

  static String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};

  @RequestMapping("/meh/greeting")
  public String greeting(Model model) {
    String shade = (int)(Math.random()*255) + ", " + (int)(Math.random()*255) + ", " +(int)(Math.random()*255);
    model.addAttribute("rainbow", shade);
    model.addAttribute("size", (int)(Math.random()*85) + "px");
    model.addAttribute("greet", hellos[(int) (Math.random() * hellos.length)]);
    return "helloAll";
  }
}