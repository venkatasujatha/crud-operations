package com.user.entity;

import javax.persistence.Id;

public class User {
	private String Name;
	@Id
	private int id;
	private String email;
	private int num;
	private int n1;
	private int n2;

	
	
	public User(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public User() {
		super();
	
	}
	public User(String name, int id, String email, int num) {
		super();
		Name = name;
		this.id = id;
		this.email = email;
		this.num = num;
		System.out.println(name+""+id+" "+email+" "+num);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
