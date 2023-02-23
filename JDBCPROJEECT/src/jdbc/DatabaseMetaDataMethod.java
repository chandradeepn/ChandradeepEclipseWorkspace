package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseMetaDataMethod {

	public static void main(String[] args) throws Exception{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasqlconnection", "root", "chandradeep76");
		DatabaseMetaData dmd=con.getMetaData();
		
		System.out.println("Driver name is: "+dmd.getDriverName());
		System.out.println("The driver version is: "+dmd.getDriverVersion());
		System.out.println("The major version of driver is: "+dmd.getDriverMajorVersion());
		System.out.println("The minor version of the driver is: "+dmd.getDriverMinorVersion());
		System.out.println("The database mahor version is: "+dmd.getDatabaseMajorVersion());
		System.out.println("The database minor version is: "+dmd.getDatabaseMinorVersion());
		System.out.println("The database product name is: "+dmd.getDatabaseProductName());
		System.out.println("The database product version is: "+dmd.getDatabaseProductVersion());
		System.out.println("The database username is: "+dmd.getUserName());
		
		System.out.println();
		String table[]= {"TABLE"};
		String view[]= {"VIEW"};
		ResultSet rs=dmd.getTables(null, null, null, table);
		while(rs.next()) {
			System.out.println(rs.getString(3));
		}

	}

}
