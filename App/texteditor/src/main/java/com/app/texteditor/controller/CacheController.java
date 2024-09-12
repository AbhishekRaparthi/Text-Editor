package com.app.texteditor.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin
public class CacheController {

    @GetMapping("/cache")
    public String getCache(){
        return "Cache";
    }
}

