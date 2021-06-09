package com.spring.SpringbootSecurityRestBase.controllers;

import com.spring.SpringbootSecurityRestBase.service.EmployeesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeesService employeesService;

    public EmployeeController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/employees")
    public List<String> getEmployees() {
        return employeesService.getAllEmployees();
    }
}