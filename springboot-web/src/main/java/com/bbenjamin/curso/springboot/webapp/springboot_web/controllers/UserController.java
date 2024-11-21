package com.bbenjamin.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title", "Hello World Springboot ");
        model.addAttribute("name", "Benjamin");
        model.addAttribute("lastname", "Benitez");
        model.addAttribute("email", "bbenjamin@correo.com");


        return "details";
    }
}
