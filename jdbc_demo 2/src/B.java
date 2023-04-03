import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		try {
			// connection
			Scanner scan = new Scanner(System.in);
			System .out.println("Enter your email");
			String email = scan.next();
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root1234");
		     System.out.println(con);

		                // sql queries
		                Statement stmnt = con.createStatement();
		                stmnt.executeUpdate("DELETE FROM register WHERE email = '"+email+"'");
		                				

		                con.close();
		                
		                // close connection 
			
		} catch (Exception e) {
		  e.printStackTrace();
			
		}
	}

}
