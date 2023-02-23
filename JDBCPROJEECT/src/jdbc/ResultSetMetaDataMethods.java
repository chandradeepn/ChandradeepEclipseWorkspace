package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataMethods {

	public static void main(String[] args) throws Exception {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		PreparedStatement ps=con.prepareStatement("select * from students");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println("the number of rows in the students are:"+rsmd.getColumnCount());
		System.out.println();
		System.out.println("the table name is the "+rsmd.getTableName(3));
		System.out.println();
		int i=1;
		try {
		while(rs.next()) {
			
		System.out.println("the coloumn name of the tables is "+rsmd.getColumnName(i));
		System.out.println("the coloumn type name of the tables is "+rsmd.getColumnTypeName(i));
		System.out.println();
		i++;
		}
		}
		catch(Exception e) {
			System.out.println("the coloumns of the tables are over");
		}
		
	}

}
