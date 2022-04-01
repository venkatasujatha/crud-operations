package com.tectoro.service;

import java.util.List;

import com.tectoro.entity.Employee;

public interface EmployeeServiceInt {
	public Employee saveEmp(Employee employee);
	public List<Employee> getAllEmp(Employee employee);
	public Employee updateEmployee(int id,Employee employee);
	

}
