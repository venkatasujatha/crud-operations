package com.tectoro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.dao.EmployeeRepoInt;
import com.tectoro.entity.Employee;
import com.tectoro.service.EmployeeServiceInt;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceInt employeeServiceInt;
	@Autowired
	private EmployeeRepoInt employeeRepoInt;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeServiceInt.saveEmp(employee);
	}
	@GetMapping("/get")
	public List<Employee> getList(Employee employee){
		return employeeServiceInt.getAllEmp(employee);
	}
	@PutMapping("/update/{id}")
	public Employee updateEmp(@RequestBody Employee employee) {
		return employeeServiceInt.saveEmp(employee);	
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable("id") int id) {
		 employeeRepoInt.deleteById(id);
		
	}
	@DeleteMapping("deleteByName/{name}")
	public String deleteByName(@PathVariable("name") String name) {
		employeeRepoInt.deleteByName(name);
		return "Delete Successfully::"+name;
	}

}
