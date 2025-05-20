package com.example.intro.controller;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import com.example.intro.Service.Service_class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class controller {

    @Autowired
    private Service_class employeeService;

    @PostMapping("/create")
    public Model createEmployee(@RequestBody dto employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }
}