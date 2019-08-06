package com.zensar;

import java.sql.SQLException;
import java.util.List;

public class Test {
public static void main(String [] args) throws SQLException
{
	EmployeeDao dao=new EmployeeDao();
	dao.create_connection();
 Employee e1=new Employee(3,"shubhu",40000); 
	
		/*
		 * int result=dao.addEmployee(e1); if(result>0) { System.out.println("success");
		 * } else { System.out.println("failed"); }
		 */
 List<Employee> listOfAllEmployees=EmployeeDao.getAllEmployees();
 for(Employee employeee1:listOfAllEmployees)
	
 {
	 System.out.println(employeee1.getEmp_id());
	 System.out.println(employeee1.getEmp_name());
	 System.out.println(employeee1.getEmp_sal());
	 
 }
}
}
