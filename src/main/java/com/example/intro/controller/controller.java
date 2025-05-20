package com.example.intro.controller;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class controller {

    @PostMapping("/create")
    public Model createEmployee(@RequestBody dto employeeDTO) {
        return new Model(1, employeeDTO.getName(), employeeDTO.getSalary());
    }
}