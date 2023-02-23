package com.assignement.week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteAndReadSelectQuery {
	
	private static void selectQuery() throws Exception { 

//		String query = "Select city_name from city where city_code=518533";
		String query1 = "select * from city";
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignement", "root","chandradeep76");
		Statement st = connect.createStatement();
		ResultSet rs = st.executeQuery(query1);
		String result = "";
		while(rs.next()){
			result= "The city name is: "+rs.getString("city_name")+" "+"and the city code is: "+
					rs.getInt("city_code")+" "+"and the city state is: "+rs.getString("city_state")+" "+
					"and the city address is: "+rs.getString("city_address");
			System.out.println(result);
		}
	}
	public static void main(String[] args) throws Exception {
		selectQuery();
	}
}