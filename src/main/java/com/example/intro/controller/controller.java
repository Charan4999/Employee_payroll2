package com.example.intro.controller;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import com.example.intro.Service.Service_class;

import java.util.List;

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

    @GetMapping("/all")
    public List<Model> getAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Model getById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Model update(@PathVariable int id, @RequestBody dto dto) {
        return employeeService.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return employeeService.deleteEmployee(id) ? "Deleted" : "Not Found";
    }
}