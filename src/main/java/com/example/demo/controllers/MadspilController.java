package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MadspilController {



    @GetMapping(value="/")
    public String homePage(){
        return "index.html";
    }

    @GetMapping(value="/Info.html")
    public String infoPage(){
        return "Info.html";
    }

    @GetMapping(value="/køleskab")
    public String køleskab() {
        return "køleskab.html";
    }

    @PostMapping(value="/køleskab-post")
    public String køleskab(Model model) {
        return "redirect:/skal-du-have-mad";
    }

    @GetMapping("/skal-du-have-mad")
    public String foodSuggestions() {
        return "food-suggestions.html";
    }
}
