package com.assignement.week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementWithResultSet {
	
	private static void preparedWithResult() throws Exception {
			
		String query1 = "select city_address from city where city_code=?";
		int code = 518545;
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignement",
				"root","chandradeep76");
		PreparedStatement pst1 = connect.prepareStatement(query1);
		pst1.setInt(1, code);
		ResultSet rs = pst1.executeQuery();
		rs.next();
		String result = rs.getString("city_address");
		System.out.println(result);
	}
	public static void main(String[] args) throws Exception{
		preparedWithResult();
	}
}
