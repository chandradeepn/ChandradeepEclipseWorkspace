package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDent {

	public static void main(String[] args) throws Exception {
		studentDAO dao=new studentDAO();
//		Student s1=dao.getName(4);
//		System.out.println(s1.student_name);
		
//		Student s2=new Student();
//		s2.student_id=7;
//		s2.student_name="pavan";
//		s2.student_age=22;
//		s2.student_hobby="series";
//		s2.student_school="git";
//		dao.addStudent(s2);
		
	
		dao.updateTable(1);
	}

}
class studentDAO{
	
//	public Student getName(int id) throws Exception {
//		String query="select student_name from students where student_id="+id;
//		Student st=new Student();
//		st.student_id=id;
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
//		Statement sta=con.createStatement();
//		ResultSet rs=sta.executeQuery(query);
//		rs.next();
//		String name=rs.getString(1);
//		st.student_name=name;
//		return st;
//	}
	
//	public void addStudent(Student s) throws Exception {
//		
//		String query="insert into students values(?,?,?,?,?)";
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
//		PreparedStatement ps=con.prepareStatement(query);
//		ps.setInt(1, s.student_id);
//		ps.setString(2, s.student_name);
//		ps.setInt(3, s.student_age);
//		ps.setString(4, s.student_hobby);
//		ps.setString(5, s.student_school);
//		ps.executeUpdate();
//	}
	
	public void updateTable(int id1) throws Exception{
		//String updatedname="nagella chandradeep";
		//int updatedage=21;
		String updatedhobby="GTA5";
		String updatedSchool="MITS";
		//String query="update students set student_name=?,student_age=? where student_id=?";
		String query1="update students set student_hobby=?,student_school=? where student_id=?";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setString(1, updatedhobby);
		ps.setString(2, updatedSchool);
		ps.setInt(3, id1);
		ps.executeUpdate();
		System.out.println("updated the hobby and school for ids are"+":"+id1);
		
	}
}
class Student{
	
	int student_id;
	String student_name;
	int student_age;
	String student_hobby;
	String student_school;
}