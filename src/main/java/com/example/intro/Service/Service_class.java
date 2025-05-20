package com.example.intro.Service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import org.springframework.stereotype.Service;

@Service
public class Service_class {
    public Model createEmployee(dto dto) {
        return new Model(1, dto.getName(), dto.getSalary());
    }
}
