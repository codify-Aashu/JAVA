


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class R {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/spring","root","root1234");
			System.out.println(con);
			 
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("Select * from register");
			while(result.next()) {
				System.out.println(result.getString(1) );
				System.out.println(result.getString(2) );
				System.out.println(result.getString(3) );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	}
}
