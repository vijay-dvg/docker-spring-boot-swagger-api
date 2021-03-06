package com.vijay.docker.springboot.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.docker.springboot.application.domain.Employee;
import com.vijay.docker.springboot.application.exception.ResourceNotFoundException;
import com.vijay.docker.springboot.application.repository.EmployeeRepository;

/**
 * EmployeeService is used to perform the Business operations
 * 
 * @author Vijay.Kumar
 * @since 16/02/2019
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	public List<Employee> getAllEmployees() throws ResourceNotFoundException {
		return employeeRepo.findAll();
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepo.saveAndFlush(employee);
	}

	public Optional<Employee> getEmployeeById(long Id) throws ResourceNotFoundException {
		return employeeRepo.findById(Id);
	}

	public Employee updateEmployee(Employee employeeDetails) throws ResourceNotFoundException {
		return employeeRepo.save(employeeDetails);
	}

	public void deleteEmployee(Employee employee) throws ResourceNotFoundException {
		employeeRepo.delete(employee);
	}

}
