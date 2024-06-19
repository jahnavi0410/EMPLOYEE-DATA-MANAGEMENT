package com.jahnavi.employeedata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jahnavi.employeedata.entity.Employee;
import com.jahnavi.employeedata.repository.EmployeeRepository;
import com.jahnavi.employeedata.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository studentRepository) {
		super();
		this.employeeRepository = studentRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);	
	}

}
