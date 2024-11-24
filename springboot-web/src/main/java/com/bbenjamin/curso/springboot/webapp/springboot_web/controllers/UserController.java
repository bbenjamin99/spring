package com.bbenjamin.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model){

        model.addAttribute("title", "Users lists");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {

        List<User> users = Arrays.asList(new User("Benjamin", "Benitez", "bbenjamin@correo.com")
        , new User("Micaela", "De Luca", "dlmicaela@correo.com")
        , new User("Ronalda", "De Luca", "dlronalda@correo.com"));

        return users;
    }
}
