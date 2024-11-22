package com.bbenjamin.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bbenjamin.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user1 = new User("Benjamin", "Benitez");
        user1.setEmail("bbenjamin@correo.com");
        model.addAttribute("title", "Hello World Springboot ");
        model.addAttribute("user", user1);


        return "details";
    }
}
