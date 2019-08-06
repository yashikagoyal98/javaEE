<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zensar.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all employees</title>
</head>
<body>
<h1> list of all Employees</h1>
<% List<Employee>listOfAllEmployees=(List<Employee>)session.getAttribute("listOfAllEmployees"); %>
<table>

	
	
<th>Employee ID:</th>
<th>Employee  Name:</th>
<th>Employee Salary:</th>
<%for(Employee employee:listOfAllEmployees){ %>
<tr>
<td><%=employee.getEmp_id() %></td>
<td><%=employee.getEmp_name() %></td>
<td><%=employee.getEmp_sal() %></td>
</tr>
<%} %>
</table>
</body>
</html>