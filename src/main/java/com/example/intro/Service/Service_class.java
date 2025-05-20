package com.example.intro.Service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Service_class {
    private List<Model> employeeList = new ArrayList<>();
    private int empId = 1;

    public Model createEmployee(dto dto) {
        Model emp = new Model(empId++, dto.getName(), dto.getSalary());
        employeeList.add(emp);
        return emp;
    }

    public List<Model> getAllEmployees() {
        return employeeList;
    }

    public Model getEmployeeById(int id) {
        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Model updateEmployee(int id, dto dto) {
        Model emp = getEmployeeById(id);
        if (emp != null) {
            employeeList.remove(emp);
            Model updated = new Model(id, dto.getName(), dto.getSalary());
            employeeList.add(updated);
            return updated;
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        return employeeList.removeIf(e -> e.getId() == id);
    }
}