package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallabaleStatementsPrintingData {

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the College id (int)");
		int clg_id=Integer.parseInt(sc.nextLine());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		CallableStatement cs=con.prepareCall("{call printingData(?,?,?,?)}");
		cs.setInt(1, clg_id);
		cs.registerOutParameter(2,java.sql.Types.VARCHAR);
		cs.registerOutParameter(3,java.sql.Types.VARCHAR);
		cs.registerOutParameter(4,java.sql.Types.VARCHAR);
		cs.execute();
		
		String name=cs.getString(2);
		String location=cs.getString(3);
		String address=cs.getString(4);
		
		if(name!=null) {
			System.out.println("College name is:"+name+" "+"College location is"+location+" "+
					"college address is "+address);
		}else {
			System.out.println("The id is not avialable in the table");
		}
	}

}
