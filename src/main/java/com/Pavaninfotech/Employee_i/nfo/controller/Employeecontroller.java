package com.Pavaninfotech.Employee_i.nfo.controller;

import com.Pavaninfotech.Employee_i.nfo.Model.Employee;
import com.Pavaninfotech.Employee_i.nfo.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    private Employeeservice employeeservice;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeservice.addEmployee(employee);
    }
}
