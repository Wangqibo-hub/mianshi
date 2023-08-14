package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping("/add/{num1}/{num2}")
    public Integer sum(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return num1 + num2;
    }
}
