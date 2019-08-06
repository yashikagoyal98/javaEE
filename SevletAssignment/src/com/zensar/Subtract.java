package com.zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class subtract
 */
@WebServlet("/subtract")
public class Subtract extends HttpServlet {
	
		public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
		int a,b;
		a=(int)request.getAttribute("a");
		b=(int)request.getAttribute("b");
		int c=a-b;
		response.getWriter().println("subtraction is " +c);
		}

}
