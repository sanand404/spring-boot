package com.demo.psql.service;

import java.util.List;

import com.demo.psql.entity.Employee;
/**
 * EmployeeService
 */
public interface EmployeeService {
	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	void deleteEmployee(Employee emp);

}
