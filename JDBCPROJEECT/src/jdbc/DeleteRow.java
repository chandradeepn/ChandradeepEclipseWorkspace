package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteRow {

	public static void main(String[] args) throws Exception{
		
		Delete dt=new Delete();
		dt.remove(1);

	}
}
class Delete{
	
	public void remove(int id) throws Exception {
		String query="delete from students where student_id=?";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}
}
