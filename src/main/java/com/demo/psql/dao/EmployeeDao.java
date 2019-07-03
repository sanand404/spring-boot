package com.demo.psql.dao;

import java.util.List;

import com.demo.psql.entity.Employee;

/**
 * EmployeeDao
 */
public interface EmployeeDao {

  List<Employee> findAll();
  void insertEmployee(Employee emp);
  void updateEmployee(Employee emp);
  void executeUpdateEmployee(Employee emp);
  public void deleteEmployee(Employee emp);
}