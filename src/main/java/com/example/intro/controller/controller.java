package com.example.intro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Employee Payroll App";
    }
}