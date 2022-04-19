package in.co.rays.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchInFinally {

	public static void main(String[] args) {
	
/*		
 * try catch block in finally block when SQLException raise
 * */
		
		Connection con = null;
		
		try{ 
		     con = DriverManager.getConnection(null);
		     
		     } 
		catch(SQLException ex) {
			ex.printStackTrace();
		      } 
		finally {    
		            try{
		            	con.close(); // throws an exception     
	
		            }
		            catch(Exception e){  
		            	e.printStackTrace();
		            }
		     }}}
		
/* **********************************************************************
		
	try catch and finally in try block
		**/