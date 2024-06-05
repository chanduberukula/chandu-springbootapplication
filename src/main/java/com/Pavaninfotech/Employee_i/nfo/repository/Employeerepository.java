package com.Pavaninfotech.Employee_i.nfo.repository;

import com.Pavaninfotech.Employee_i.nfo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {

}
