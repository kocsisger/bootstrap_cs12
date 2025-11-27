package hu.unideb.inf.bootstrap_cs122.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/persons")
    public String showPersons() {
        return "persons";
    }

}
