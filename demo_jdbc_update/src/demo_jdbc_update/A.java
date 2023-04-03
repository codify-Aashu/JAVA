package demo_jdbc_update;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



public class A {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			System .out.println("Enter your mobile");
			String mobile = scan.next();
			System .out.println("Enter your email");
			String email = scan.next();
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/spring","root","root1234");
			System.out.println(con);
			 
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate(" UPADTE register SET mobile = '"+mobile+"' WHERE email= '"+email+"' ");
			 con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	}
}
