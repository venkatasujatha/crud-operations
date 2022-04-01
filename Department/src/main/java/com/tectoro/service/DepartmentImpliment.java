package com.tectoro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tectoro.model.Deparment;
import com.tectoro.repository.DepartmentRepo;

@Service
public class DepartmentImpliment implements DeparInterface{

	@Autowired
	private DepartmentRepo departmentRepo1;
	@Override
	public Deparment addDepartment(@RequestBody Deparment  department) {
		
		return departmentRepo1.save(department);
		
		
	}
	@Override
	public Optional<Deparment> findbyId(int id) {
		Optional<Deparment> byId = departmentRepo1.findById(id);
		return byId;
		
	}
	@Override
	public List<Deparment> findall() {
		return departmentRepo1.findAll();
		
	}
	
	

}
