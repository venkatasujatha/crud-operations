package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserServiceImpl;
import com.user.service.UserServiceInt;

@RestController
public class UserController {
	@Autowired
	UserServiceInt serviceInt;
	
	/*@GetMapping("/edupu")
	public List<User> epudustha()
	{
		serviceInt.
	}*/
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		
		return serviceInt.save(user);
	}
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		int n1=user.getN1();
		int n2=user.getN2();
		return serviceInt.addData(n1, n2);
	}
	@PostMapping("/age")
	public String ageFind(@RequestBody User user) {
		int n1=user.getN1();
		return serviceInt.age(n1);
	}
	@DeleteMapping("/delete/{n1}")
	
	public void delete(@PathVariable int n1)
	{
		 
		
		serviceInt.delete(n1);
	}
	
	
}
