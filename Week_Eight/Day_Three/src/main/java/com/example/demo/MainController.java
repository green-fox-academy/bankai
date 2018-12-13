package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private List<BankAccount> accounts;

  public MainController() {
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 10000, "lion", true, true));
    accounts.add(new BankAccount("Timon", 1000, "meerkat", false, true));
    accounts.add(new BankAccount("Pumba", 100, "warthog", false, true));
    accounts.add(new BankAccount("Rafiki", 5000, "mandrill", false, true));
    accounts.add(new BankAccount("Scar", 3000, "lion", false, true));

  }

  @GetMapping("")
  public String showIndexPageModel(Model model) {
    model.addAttribute("name", "name");
    return "index";
  }

  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", true, true));
    return "show";
  }
  @GetMapping("/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "accounts";
  }

  @PostMapping("/accounts")
  public String donationAccounts(@RequestParam String animalacc) {
    accounts.stream().filter(animal -> animal.getName().equals(animalacc)).forEach(animal -> animal.setBalance(animal.getBalance() + 10));
    accounts.stream().filter(a -> a.isKing()).filter(a -> a.getName().equals(animalacc)).forEach(a -> a.setBalance(a.getBalance() + 90));
    return "redirect:/accounts";
  }

  @GetMapping ("/donation")
  public String showDonation(Model model) {
    model.addAttribute("accounts", accounts);
    return "donation";
  }

//  @PostMapping("/donation")
//  public String donate(@RequestParam String animalacc) {
//    accounts.stream().filter(animal -> animal.getName().equals(animalacc)).forEach(animal -> animal.setBalance(animal.getBalance() + 10));
//    accounts.stream().filter(a -> a.isKing()).filter(a -> a.getName().equals(animalacc)).forEach(a -> a.setBalance(a.getBalance() + 90));
//    return "redirect:/accounts";
//  }

}
