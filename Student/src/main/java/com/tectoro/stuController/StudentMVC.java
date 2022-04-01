package com.tectoro.stuController;

import java.security.PublicKey;

import com.tectoro.serviceStudentImpl.StudentMvcController;
import com.tectoro.stupack.Student;

public class StudentMVC 

{
	public static Student setdata() {
		Student student=new Student();
		student.setId(1);
		student.setName("Sujatha");
		student.setRollNo(123);
		return student;
	}
	public static void main(String[] args)
	{
		Student model=setdata();
		studentView1 view1=new studentView1();
		StudentMvcController controller=new StudentMvcController(model, view1);
		controller.update();
		controller.setStudentName("Ramesh");
		controller.update();
		
		
}
}
