package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLCommands {

	public static void main(String[] args) throws Exception {
		
		//String query="alter table students add phonenumber int(10)";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		Statement sta=con.createStatement();
		//sta.execute(query);
		//System.out.println("A phonenumber column is added into the students table");
//		String query1="alter table students drop phonenumber";
//		sta.execute(query1);
//		System.out.println("removed phonenumber");
//		String query2="alter table students modify phonenumber int(21)";
//		sta.execute(query2);
//		System.out.println("modified the capacity of the phonenumber");
//		String query3="create table kit(id int,name char(4))";
//		sta.execute(query3);
//		System.out.println("created the kit table");
//		String query6="alter table kit modify name char(10)";
//		sta.execute(query6);
//		System.out.println("updated name ");
//		String query4="insert into kit values(1,chan)";
//		sta.execute(query4);
//		System.out.println("added a row in kit");
//		String query5="truncate kit";
//		sta.execute(query5);
//		System.out.println("truncated the kit table");
		String query7="drop table kit";
		sta.execute(query7);
		System.out.println("deleted the structure and data of the table");
	}

}
