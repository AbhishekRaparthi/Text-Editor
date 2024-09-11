package com.app.texteditor.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class HelloWorldController {

    @GetMapping("/home")
    public String getName(){
        return "Hello user";
    }
}
