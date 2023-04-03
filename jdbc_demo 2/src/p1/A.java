package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		try {
			// connection
			Scanner scan = new Scanner (System.in);
			System .out.println("Enter your name");
			String name = scan.next();
			
			System .out.println("Enter your city");
			String city = scan.next();
			System .out.println("Enter your email");
			String email = scan.next();
			System .out.println("Enter your mobile");
			String mobile = scan.next();
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root1234");
		     System.out.println(con);

		                // sql queries
		                Statement stmnt = con.createStatement();
		                stmnt.executeUpdate("insert into register value('"+name+"','"+city+"','"+email+"','"+mobile+"') ");
		               

		                con.close();
		                
		                // close connection 
			
		} catch (Exception e) {
		  e.printStackTrace();
			
		}
	}

}
