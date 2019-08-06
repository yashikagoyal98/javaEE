package com.zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class SqServlet extends HttpServlet
{
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
/*int c=(int)request.getAttribute("c");
int square=c*c;
response.getWriter().println("Square is"+square);*/

/*int c=Integer.parseInt(request.getParameter("c"));
int square=c*c;
response.getWriter().println("Square is"+square);
*/

   /*HttpSession session=request.getSession();
int c=(int)session.getAttribute("c");
int square=c*c;
response.getWriter().println("Square is"+square);
*/

                int c=0;
   Cookie[] cookies=request.getCookies();
   for(Cookie cookie:cookies)
   {
   	if(cookie.getName().equals("c"))
   	{
   	c= Integer.parseInt(cookie.getValue());
   	}
   }
   int square=c*c;
   response.setContentType("texthtml");                               //html tags
   response.getWriter().println("<h2> Square is "+square+"</h2>");
   
}
}