package com.zensar.services;

import java.util.ArrayList;
import java.util.List;


import com.zensar.dao.StudentDao;
import com.zensar.model.Student;

public class StudentService {
	private  StudentDao dao;
	
	public  void insertIntoTable(Student s)
	{
		dao=new StudentDao();
	 dao.addStudent(s);
	}
	public List<Student> getAllStudents()
	{
		System.out.println("inside get service");
		dao=new StudentDao();
		return dao.getAllStudents();
	}

}
