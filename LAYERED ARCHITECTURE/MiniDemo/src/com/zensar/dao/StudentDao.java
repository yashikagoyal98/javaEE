package com.zensar.dao;

import java.sql.*;
import java.util.ArrayList;

import javax.security.auth.login.Configuration;
import javax.websocket.Session;

import org.hibernate.SessionFactory;

import java.util.*;

import com.zensar.model.Student;

public class StudentDao {
 private static Connection conn;
 static
 {
	 try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		} 
	 catch (Exception e) 
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			/* System.out.println("connection established"); */
		System.out.println("driver loaded");
	}
	 
 
		public void addStudent(Student s)
		{
			try {
				//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				PreparedStatement pstmt= conn.prepareStatement("insert into student values(?,?,?)");
				pstmt.setInt(1,s.getRollno());
				pstmt.setString(2,s.getName());
				pstmt.setDouble(3,s.getPercentage());
				pstmt.execute();
				//conn.close();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			//System.out.println("connected to database");
				
				
				
			
			public List<Student> getAllStudents()
			{
				List<Student> list=new ArrayList<>();
				
				try
				{
					Statement stmt = conn.createStatement();
					ResultSet rs=stmt.executeQuery("select * from student");
					while(rs.next())
					{
						Student s= new Student();
						s.setRollno(rs.getInt(1));
						s.setName(rs.getString(2));
						s.setPercentage(rs.getDouble(3));
						list.add(s);
						
					}
					for(Student temp:list)
					{
						temp.display();
					}
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("inside get dao");
				return list;
			}
				

	}
