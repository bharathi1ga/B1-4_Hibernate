package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args)
	{
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		//CRUD Operation
		student.setID(13);
		student.setName("Bharathi");
		service.addStudent(student);
		/*//retrive data-find();
		student =service.findStudentById(11);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());*/
		//update
		student =service.findStudentById(11);
		student.setName("Nikitha");
		service.updateStudent(student);
		
		//delete
		student =service.findStudentById(11);
		student.setName("Nikitha");
		service.removeStudent(student);
		
		
		
	}

}
