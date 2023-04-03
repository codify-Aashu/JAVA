import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {// connection code ...
			 Connection con = DriverManager.getConnection
					 ("jdbc:mysql://localhost:3306/spring","root","root1234");
		     System.out.println(con);
		     
		     
		     // sql query
		     
		     Statement stmnt = con.createStatement();
            //stmnt.executeUpdate("DELETE FROM register WHERE email = 'rishu@gmail.com'");
            //stmnt.executeUpdate("insert into register values( 'ayaan','varanasi', 'ayan@gmail.com','0987654321')");
		    //stmnt.executeUpdate("UPDATE register SET moblie ='7878787878' WHERE email ='chiku@gmail.com' ");
		     
		     // Read data from the database .... query...
		     ResultSet result = stmnt.executeQuery("Select * from register");
				while(result.next()) {
					System.out.println(result.getString(1) );
					System.out.println(result.getString(2) );
					System.out.println(result.getString(3) );
					System.out.println(result.getString(4) );
		     
				}
		     
		     // close connection
             con.close();
             				

			
			
		} catch (Exception e) {
			e.printStackTrace();
			

		}
		
		
	}
	
}
		



			         		
			         		
     					         
			         
			         
			         
			         
					
			
			
			
		
		
		
	
	
	


