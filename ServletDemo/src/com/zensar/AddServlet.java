package com.zensar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet 
{
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException 
{
int a,b;
a=Integer.parseInt(request.getParameter("num1"));
b=Integer.parseInt(request.getParameter("num2"));
int c=a+b;
int z=100;
//RequestDispatcher rd=request.getRequestDispatcher("sq");
//request.setAttribute("c", c);
//rd.forward(request, response);

//response.sendRedirect("sq?c="+c);     //a)using url rewrititing

/*HttpSession session=request.getSession();       //b) using session object
session.setAttribute("c",c);
response.sendRedirect("sq");
*/

Cookie c_cookies=new Cookie("c",c+"");    //for multiple obj create new cookie for each
Cookie z_cookies=new Cookie("z",z+""); 
response.addCookie(c_cookies);
response.sendRedirect("sq");
}
}