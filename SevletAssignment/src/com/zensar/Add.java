package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class function
 */
@WebServlet("/add")
public class Add extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	int a,b;
	a=(int)request.getAttribute("a");
	b=(int)request.getAttribute("b");
	int c=a+b;
	response.getWriter().println("Addition is " +c);
	}
}

