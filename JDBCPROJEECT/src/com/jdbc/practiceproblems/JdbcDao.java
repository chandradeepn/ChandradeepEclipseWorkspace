package com.jdbc.practiceproblems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDao {

	public static void main(String[] args) throws Exception{

		EmployeeDao ed=new EmployeeDao();
		Employee e1=ed.getDetails("IS5933");
		System.out.println(e1.emp_name);
		

	}

}
class EmployeeDao {
	
	public Employee getDetails(String id) throws Exception {
	String query="select emp_name from employee where emp_id="+id;
	Employee e=new Employee();
	e.emp_id=id;
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root",
			"chandradeep76");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String result=rs.getString(1);
	e.emp_name=result;
	System.out.println(result);
	st.close();
	con.close();
	return e;
	
	}

}
class Employee {

	String emp_id;
	String emp_name;
	String emp_native;
	String emp_location;

}

