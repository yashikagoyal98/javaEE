package com.zensar;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeController extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	viewAllEmployee(request,response);
		/* addEmployee(request, response); */
}
public void viewAllEmployee(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	EmployeeDao dao= new EmployeeDao();
	try {
		List<Employee> listOfAllEmployees=dao.getAllEmployees();
		HttpSession session=request.getSession();
		session.setAttribute("listOfAllEmployees", listOfAllEmployees);
		response.sendRedirect("ViewAllEmployee.jsp");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

private void addEmployee(HttpServletRequest request, HttpServletResponse response) {
	int Emp_id=Integer.parseInt(request.getParameter("Emp_id"));
	String Emp_name=request.getParameter("Emp_name");
	int Emp_sal=Integer.parseInt(request.getParameter("Emp_sal"));
	System.out.println("EmployeeId:"+Emp_id);
	System.out.println("EmployeeName:"+Emp_name);
	System.out.println("salary:"+Emp_sal);
	
	EmployeeDao dao=new EmployeeDao();
	try {
		dao.addEmployee(new Employee(Emp_id,Emp_name,Emp_sal));
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		response.sendRedirect("Sucess.jsp");
		//response.getWriter().print("<h1>Thankk you for registration</h1>");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}