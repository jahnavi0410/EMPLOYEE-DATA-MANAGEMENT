package com.jahnavi.employeedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jahnavi.employeedata.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
