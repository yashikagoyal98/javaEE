package com.zensar;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDao {

private static final Connection Con = null;
private PreparedStatement pstmt = null;

public static  Connection create_connection()
{
	Connection con=null;
	try {
		

	Class.forName("com.mysql.jdbc.Driver");
	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return con;
}
public int addEmployee(Employee e1) throws SQLException
{
	
		Connection con=create_connection();
	    String sql="insert into Employee values(?,?,?)";
	    
	    pstmt=con.prepareStatement(sql);
	    pstmt.setInt(1,e1.getEmp_id());
	    pstmt.setString(2, e1.getEmp_name());
	    pstmt.setInt(3,e1.getEmp_sal());
	    
	    int result=pstmt.executeUpdate();
	    
		return result;
	
	
}
public static List<Employee> getAllEmployees() throws SQLException
{
	List<Employee> listOfAllEmployees=new ArrayList<Employee>();
	Connection con=create_connection();
	String sql="select* from Employee";
	PreparedStatement pstmt=con.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	while(rs.next())
	{
		int Emp_id=rs.getInt("Emp_id");
		String Emp_name=rs.getString("Emp_name");
		int Emp_sal=rs.getInt("Emp_sal");
		Employee e1=new Employee(Emp_id,Emp_name,Emp_sal);
		listOfAllEmployees.add(e1);
		
	}
	System.out.println(listOfAllEmployees);
	return listOfAllEmployees;
}
	
		
	}
	


