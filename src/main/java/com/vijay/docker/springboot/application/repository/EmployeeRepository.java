package com.vijay.docker.springboot.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.docker.springboot.application.domain.Employee;

/**
 * EmployeeRepository is used to perform the DB operations
 * 
 * @author Vijay.Kumar
 * @since 16/02/2019
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
