package com.game.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @RequestMapping("/")
    public String showForm(){
        return "index";
    }
}
