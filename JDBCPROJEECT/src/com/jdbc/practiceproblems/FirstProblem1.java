package com.jdbc.practiceproblems;

import java.sql.*;


public class FirstProblem1 {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/javasqlconnection";
		String username="root";
		String password="chandradeep76";
		String query="select student_name from students where student_id=1";
		String query1="select * from students";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection(url,username,password);
		Statement st=con1.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String results=rs.getString("student_name");
		
		String result="";
		ResultSet rs1=st.executeQuery(query1);
		while(rs1.next()) {
		result=rs1.getInt(1)+":"+rs1.getString(2)+":"+rs1.getInt(3)+":"+rs1.getString(4)+":"+
		rs1.getString(5);
		System.out.println(result);
		}
		//System.out.println(results);
		st.close();
		con1.close();
	}

}
