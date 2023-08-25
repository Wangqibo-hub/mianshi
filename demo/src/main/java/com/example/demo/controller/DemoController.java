package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    private DemoService demoService;


    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping("/add/{num1}/{num2}")
    @ResponseBody
    public Integer sum(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return demoService.add(num1, num2);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
