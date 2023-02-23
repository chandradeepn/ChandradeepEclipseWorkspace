package com.assignement.week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery {
	
	private static void queriesExecuting() throws Exception{
		
		String query = "delete from city where city_id=?";
		String query1 = "select city_state from city where city_id=8";
		int id = 6;
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignement",
				"root","chandradeep76");
		Statement st = connect.createStatement();
		ResultSet rs = st.executeQuery(query1);
		rs.next();
		String value = rs.getString("city_state");
		PreparedStatement pst = connect.prepareStatement(query);
		pst.setInt(1, id);
		pst.executeUpdate();
		System.out.println(value);
		System.out.println("deleted a row from city table");
		
	}

	public static void main(String[] args) throws Exception{
		queriesExecuting();

	}

}
