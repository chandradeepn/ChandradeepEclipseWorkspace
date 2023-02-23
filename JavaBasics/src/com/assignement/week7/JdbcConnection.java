package com.assignement.week7;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcConnection {

	private static void connectionReturns() throws Exception {

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignement", "root", "chandradeep76");
		DatabaseMetaData dmd = connect.getMetaData();
		System.out.println(dmd.getDriverMajorVersion());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDatabaseMajorVersion());
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDatabaseProductVersion());
		System.out.println(dmd.getJDBCMajorVersion());
		System.out.println(dmd.getMaxColumnsInIndex());
	}
	public static void main(String[] args) throws Exception{
		connectionReturns();
	}
}
