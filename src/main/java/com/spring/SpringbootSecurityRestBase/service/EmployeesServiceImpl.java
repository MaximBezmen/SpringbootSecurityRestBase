package com.spring.SpringbootSecurityRestBase.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    @Override
    public List<String> getAllEmployees() {
        return Arrays.asList("Vasy", "Pety", "Nikita", "Ivan");
    }
}
