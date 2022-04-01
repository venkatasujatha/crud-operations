package com.tectoro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.dao.EmployeeRepoInt;
import com.tectoro.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInt {
	@Autowired
   private EmployeeRepoInt employeeRepoInt;
	@Override
	public Employee saveEmp(Employee employee) {
		
		return employeeRepoInt.save(employee);
	}
	@Override
	public List<Employee> getAllEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepoInt.findAll();
	}
	@Override
	public Employee updateEmployee(int id, Employee employee) {
		
		
		return employeeRepoInt.save(employee);
	}
	
}
