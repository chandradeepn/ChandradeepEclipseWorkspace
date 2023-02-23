package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallabaleStatementMethods {

	public static void main(String[] args) throws Exception{

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id (int)");
		int clg_id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the college name ");
		String clg_name=sc.nextLine();
		System.out.println("Enter the college location");
		String clg_location=sc.nextLine();
		System.out.println("Enter the college address");
		String clg_address=sc.nextLine();
		
//		System.out.println("Enter the employee id to remove the row");
//		int clg_id=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		CallableStatement cs=con.prepareCall("{call college(?,?,?,?)}");
		cs.setInt(1, clg_id);
		cs.setString(2,clg_name);
		cs.setString(3, clg_location);
		cs.setString(4, clg_address);
		cs.executeUpdate();
		System.out.println("SUCESSFULLY ENTERED THE DATA INTO THE COLLEGE TABLE");
//		CallableStatement cs=con.prepareCall("{call collegeis(?)}");
//		cs.setInt(1, clg_id);
//		cs.executeUpdate();
//		System.out.println("deleted one row");
	}

}
