package demo_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try { 
			// connect to database
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mysqldb1","root","root1234");
		              System.out.println(con);
			// write sql queries
		             Statement stmnt = con.createStatement();
		              stmnt.executeUpdate("insert into registration values('lucky')");
		               con.close();
		              		
		             
			
			
			
			
			//close connection
			
		
			
		} catch (Exception e) {
			e.printStackTrace();}

		}
		
	

}
