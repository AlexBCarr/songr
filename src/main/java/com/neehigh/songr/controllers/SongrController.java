package com.neehigh.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SongrController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(Model model, @PathVariable String text) {
        model.addAttribute("capitalizedText", text.toUpperCase());
        return "capitalize";
    }

    @GetMapping("/")
    public String splash() {
        return "splash";
    }

    @GetMapping("/albums")
    public String albums(Model m) {
        Album[] albums = {
             new Album("Carter 2", "Lil Wayne", 22, 4657,"/static/carter2.jpg"),
             new Album("Port of Miami", "Rick Ross", 19,4669,"/static/portofmiami.jpg"),
             new Album("ASTROWORLD", "Travis Scott", 17, 3522,"/static/astroworld.jpg")

        };
        m.addAttribute("albums", albums);
        return "albums";
    }
}