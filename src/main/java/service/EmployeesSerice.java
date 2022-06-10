package com.example.thithi.service;

import com.example.thithi.entity.Employees;
import com.example.thithi.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeesService {
    @Autowired
    private EmployeesRepository employeesRepository;
    public Iterable<Employees> findAll() {
        return employeesRepository.findAll();
    }

    public Employees save(Employees employee) {
        return employeesRepository.save(employee);
    }


}

