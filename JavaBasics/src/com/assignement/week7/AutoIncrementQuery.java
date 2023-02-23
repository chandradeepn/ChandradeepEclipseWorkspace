package com.assignement.week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSet;

public class AutoIncrementQuery {
	
	private static void autoIncrement() throws Exception {
		
		String query = "insert into city(city_name,city_code,city_state ,city_address) values(?,?,?,?)";
		String name = "Pamulapadu";
		int code = 518545;
		String state = "Ap";
		String address = "Near vgd";
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignement", 
				"root", "chandradeep76");
		PreparedStatement pst = connect.prepareStatement(query);
		pst.setString(1, name);
		pst.setInt(2, code);
		pst.setString(3, state);
		pst.setString(4, address);
		int count=pst.executeUpdate();
		System.out.println(count+" "+"rows effected");
	}
	public static void main(String[] args) throws Exception {	
		autoIncrement();
	}
}
