package com.user.service;

import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public interface UserServiceInt{
	public User save(User  user);
	public String addData(int n1,int n2);
	public String age(int n1);
	public String delete(int n1);

}
