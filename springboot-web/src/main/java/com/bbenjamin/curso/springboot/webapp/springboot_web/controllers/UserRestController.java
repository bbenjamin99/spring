package com.bbenjamin.curso.springboot.webapp.springboot_web.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String,Object> details(){
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World Springboot ");
        body.put("name", "Benjamin");
        body.put("lastname", "Benitez");
        body.put("email", "bbenjamin@correo.com");

        return body;
        
    }
}
