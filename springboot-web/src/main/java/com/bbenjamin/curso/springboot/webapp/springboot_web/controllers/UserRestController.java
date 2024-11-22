package com.bbenjamin.curso.springboot.webapp.springboot_web.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbenjamin.curso.springboot.webapp.springboot_web.models.User;
import com.bbenjamin.curso.springboot.webapp.springboot_web.models.dto.UserDto;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user1 = new User("Benjamin", "Benitez");
        userDto.setUser(user1);
        userDto.setTitle("Hello World Springboot");
        return userDto;
    }

    @GetMapping("/list")    
    public List<User> list(){
        User benja = new User("Benjamin", "Benitez");
        benja.setEmail("bbenjamin@correo.com");
        User mica = new User("Micaela", "De Luca");
        User rocco = new User("Rocco", "De Luca");

        List<User> users = Arrays.asList(benja,mica,rocco);
        return users;
    }

    @GetMapping("/details-map")
    public Map<String,Object> details2(){
        Map<String, Object> body = new HashMap<>();
        User user1 = new User("Benjamin", "Benitez");
        body.put("title", "Hello World Springboot ");
        body.put("user", user1);

        return body;
    }
}
