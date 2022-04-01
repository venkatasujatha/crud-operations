package com.tectoro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.model.Deparment;
import com.tectoro.service.DeparInterface;

@RestController
public class DepartmentController {
	
	@Autowired
	DeparInterface deparInterface;
	@PostMapping("/add")
	public Deparment addDepartment(@RequestBody Deparment department )
	{
		return deparInterface.addDepartment(department);
		 
	}
	
	@GetMapping("getdetails/{id}")
	public  Optional<Deparment> findbyID( @PathVariable int id )
	{
		return deparInterface.findbyId(id);
		
	}
	
	@GetMapping("/findall")
	public List<Deparment> fins()
	{
		return deparInterface.findall();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
