package com.example.employeedatabase.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeedatabase.database.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
