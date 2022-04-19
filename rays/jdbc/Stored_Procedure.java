package in.co.rays.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/* please check book page no 24.
	 * 
	CREATE PROCEDURE getName ( IN a INTEGER, OUT n VARCHAR(50))  
	BEGIN  
	SELECT name FROM user WHERE id = a INTO n;
	END
    */

public class Stored_Procedure {

	public static void main(String[] args) throws Exception{  
		  
		Class.forName("com.mysql.jdbc.driver");  
		Connection con = DriverManager.getConnection(  
		"jdbc:mysql:localhost//3306/DataBase","root","root");  
		  
		CallableStatement stmt = con.prepareCall("{call getName(?,?)}");  
		stmt.setInt(1,100);  
		stmt.setString(2,"Shubham");  
		stmt.execute();  
		  
		System.out.println("successfully stored ");  
		}  
	
}
