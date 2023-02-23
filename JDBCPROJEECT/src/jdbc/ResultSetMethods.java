package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetMethods {

	public static void main(String[] args)  throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		//PreparedStatement ps=con.prepareStatement("select * from students");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.TYPE_SCROLL_INSENSITIVE);
		ResultSet rs=st.executeQuery("select * from students");
		
//		rs.next();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
//				" "+rs.getString(5));
//		rs.next();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
//				" "+rs.getString(5));
//		rs.previous();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
//				" "+rs.getString(5));
		rs.first();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
				" "+rs.getString(5));
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
				" "+rs.getString(5));
	rs.absolute(5);
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
			" "+rs.getString(5));
	rs.relative(3);
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+
			" "+rs.getString(5));

	}

}
