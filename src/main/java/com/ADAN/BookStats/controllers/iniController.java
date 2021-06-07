package com.ADAN.BookStats.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class iniController {

    @GetMapping("/")
    public String ini() {
        return "index";
    }
}
