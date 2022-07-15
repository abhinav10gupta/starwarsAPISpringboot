package com.starwarsAPI.starwarsAPISpringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarwarsAPIController {

    @GetMapping("/home")
    public String home(){
        return "Testing configuration.";
    }
    @GetMapping("/information")
    public String error(){
        return "Testing API configurations.";
    }
}
