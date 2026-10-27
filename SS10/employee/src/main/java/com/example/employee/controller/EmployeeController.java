package com.example.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public ResponseEntity<List<String>> getEmployees() {
        List<String> employees = List.of("Employee 1", "Employee 2", "Employee 3");
        return ResponseEntity.ok(employees);
    }
}