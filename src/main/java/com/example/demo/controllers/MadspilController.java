package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadspilController {

    @GetMapping(value="/")
    public String homePage(){
        return "index.html";
    }

    @GetMapping(value="food-suggestions")
    public String foodSuggestions() {
       return "redirect:/food-suggestions";
    }
}
