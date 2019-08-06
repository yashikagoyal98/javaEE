package com.zensar.ui;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.dao.StudentDao;
import com.zensar.model.Student;
import com.zensar.services.StudentService;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/Studserv")
public class StudentServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException
	{
		Student s=new Student();
		StudentService stud= new StudentService();
		String operation=request.getParameter("btn");
		System.out.println(operation);
		if(operation.equals("register"))
				{		
		s.setRollno(Integer.parseInt(request.getParameter("rollno")));
		s.setName(request.getParameter("name"));
		s.setPercentage(Double.parseDouble(request.getParameter("per")));
		s.display();
		
		stud.insertIntoTable(s);
		response.setContentType("text/html");
		response.getWriter().print("<h2> Thank you for Registration</h2>");
				}
		else if (operation.equals("show_students"))
		{
			List<Student> list=stud.getAllStudents();
			for(Student temp:list)
			{
				response.setContentType("text/html");
				response.getWriter().print("<h6>" +temp.getRollno()+" "+temp.getName()+" " +temp.getPercentage()+"</h6>");
				
			}
		}
		
}
}