package com.wildcodeschool.queteChallengeSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avenger() {
        return "Avengers... Assemble";

    }

    @GetMapping("/secret-bases")
    public String secret() {
        return "Les villes des campus de la Wild sont : Bordeaux,Paris,Nantes,Lille,Toulouse,Lyon";

    }
}
