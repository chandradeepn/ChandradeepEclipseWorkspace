package com.jdbc.practiceproblems;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
public class UpdateTable {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/javasqlconnection";
		String username="root";
		String password="chandradeep76";
		String query="insert into students values(7,'pavan',24,'series','fukc')";
		String query1="insert into students values(?,?,?,?,?)";
		int id=8;
		String name="shashank";
		int age=24;
		String hobby="series";
		String schoolname="keshava reddy";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st1=con.createStatement();
		int rs=st1.executeUpdate(query);
		System.out.println(rs+" "+"row effected");
		
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setInt(1,id);
		ps1.setString(2, name);
		ps1.setInt(3,age);
		ps1.setString(4, hobby);
		ps1.setString(5, schoolname);
		int count=ps1.executeUpdate();
		System.out.println(count+" "+"rows effected");
		ps1.close();
		st1.close();
		con.close();
	}

}
