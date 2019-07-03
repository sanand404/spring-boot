package com.demo.psql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.psql.entity.Employee;

import org.springframework.jdbc.core.RowMapper;

/**
 * EmployeeRowMapper
 */
public class EmployeeRowMapper implements RowMapper<Employee>{

  @Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getString("employeeId"));
		emp.setEmployeeName(rs.getString("employeeName"));
		emp.setEmployeeEmail(rs.getString("employeeEmail"));
    return emp;
	}
}