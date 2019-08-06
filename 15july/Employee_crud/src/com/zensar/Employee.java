package com.zensar;

public class Employee {
	private static int Emp_id;
	private static String Emp_name;
	private static int Emp_sal;
	
	public Employee(int emp_id,String emp_name,int emp_sal) {
		super();
		Emp_id=emp_id;
		Emp_name=emp_name;
		Emp_sal = emp_sal;
	}
	@Override
	public String toString() {
		return "Employee [Emp_sal=" + Emp_sal + "]";
	}
	public static int getEmp_id() {
		return Emp_id;
	}
	public static void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public static String getEmp_name() {
		return Emp_name;
	}
	public static void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public static int getEmp_sal() {
		return Emp_sal;
	}
	public void setEmp_sal(int emp_sal) {
		Emp_sal = emp_sal;
	}

	
}