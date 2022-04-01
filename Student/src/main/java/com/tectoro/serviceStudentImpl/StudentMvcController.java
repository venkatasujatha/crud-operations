package com.tectoro.serviceStudentImpl;

import com.tectoro.stuController.studentView1;
import com.tectoro.stupack.Student;

public class StudentMvcController 
{
	private Student move;
	private studentView1 details;
	public StudentMvcController(Student move, studentView1 details) 
	{
		super();
		this.move = move;
		this.details = details;
	}
	public void setStudentName(String name) {
		move.setName(name);
	}
	public void setId(int id) {
		move.setId(id);
	}
	public void setRollNo(int rollno) {
		move.setRollNo(rollno);
	}
	public int getId() {
		return move.getId();
	}
	public String getName() {
		return move.getName();
	}
	public int getRollNo() {
		return move.getRollNo();
	}
	public void update() {
		details.details(getId(), getName(), getRollNo());
	}
	
	
	
	
	
}
