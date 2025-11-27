package hu.unideb.inf.bootstrap_cs122.controller;

import hu.unideb.inf.bootstrap_cs122.model.Person;
import hu.unideb.inf.bootstrap_cs122.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/persons")
    public String showPersons(Model model) {
        model.addAttribute("personsList", personRepository.findAll());
        return "persons";
    }

    @GetMapping("/persons/new")
    public String newPerson(Model model) {
        model.addAttribute("newPerson", new Person());
        return "newPersonForm";
    }

    @PostMapping("/persons/save")
    public String savePerson(Person newPerson) {
        personRepository.save(newPerson);
        return "redirect:/persons";
    }

    @GetMapping("/persons/delete/{id}")
    public String deletePerson(@PathVariable int id) {
        personRepository.deleteById(id);
        return "redirect:/persons";
    }

}
