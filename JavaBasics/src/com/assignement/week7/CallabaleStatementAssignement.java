package com.assignement.week7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallabaleStatementAssignement {
	
	private static void procedures() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city code (int)");
		int ccode = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the city name ");
		String cname = sc.nextLine();
		System.out.println("Enter the city state");
		String cstate = sc.nextLine();
		System.out.println("Enter the city address");
		String caddress = sc.nextLine();
		String query = "update city set city_name=?,city_code=?,city_state=?,city_address=? where city_id=?";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignement", 
				"root", "chandradeep76");
		CallableStatement cs = con.prepareCall("{call insertingdata(?,?,?,?)}");
		cs.setString(1,cname);
		cs.setInt(2, ccode);
		cs.setString(3, cstate);
		cs.setString(4, caddress);
		cs.executeUpdate();
		System.out.println("SUCESSFULLY ENTERED THE DATA INTO THE CITY TABLE");
		CallableStatement cs1 = con.prepareCall(query);
		cs1.setString(1, "siruseri");
		cs1.setInt(2, 518456);
		cs1.setString(3, "TN");
		cs1.setString(4, "in chennai");
		cs1.setInt(5, 9);
		int count = cs1.executeUpdate();
		System.out.println(count+" "+"row updated");
	}

	public static void main(String[] args) throws Exception{
		procedures();

	}

}
