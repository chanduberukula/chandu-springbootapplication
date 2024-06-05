package com.Pavaninfotech.Employee_i.nfo.service;

import com.Pavaninfotech.Employee_i.nfo.Model.Employee;
import com.Pavaninfotech.Employee_i.nfo.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
    @Autowired
    private Employeerepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}
