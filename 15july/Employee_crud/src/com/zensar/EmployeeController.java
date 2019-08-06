package com.zensar;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeController extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		int Emp_id=Integer.parseInt(request.getParameter("Emp_id"));
		int Emp_name=request.getParameter("Emp_name");
		int Emp_sal=Integer.parseInt(request.getParameter("Emp_sal"));
		System.out.println("Employee id="+Emp_id);
		System.out.println("Employee name="+Emp_name);
		System.out.println("Employee salary="+Emp_sal);
	}

}
