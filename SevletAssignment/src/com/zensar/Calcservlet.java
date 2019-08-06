package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcservlet
 */
@WebServlet("/Calcservlet")
public class Calcservlet extends HttpServlet {
			protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int a,b;
				a=Integer.parseInt(request.getParameter("num1"));
				b=Integer.parseInt(request.getParameter("num2"));
				String d;
				d=request.getParameter("operation");
				if(d!=null && d.equals("add"))
				{
					RequestDispatcher rd1=request.getRequestDispatcher("add");
					request.setAttribute("a",a);
					request.setAttribute("b",b);
					rd1.forward(request,response);
				}
				
				if(d!=null && d.equals("subtract"))
				{
					RequestDispatcher rd2=request.getRequestDispatcher("subtract");
					request.setAttribute("a",a);
					request.setAttribute("b",b);
					rd2.forward(request,response);
				}
				if(d!=null && d.equals("multiply"))
				{
					RequestDispatcher rd3=request.getRequestDispatcher("multiply");
					request.setAttribute("a",a);
					request.setAttribute("b",b);
					rd3.forward(request,response);
				}
				if(d!=null && d.equals("divide"))
				{
					RequestDispatcher rd4=request.getRequestDispatcher("divide");
					request.setAttribute("a",a);
					request.setAttribute("b",b);
					rd4.forward(request,response);
				}
		}

	}

