package exception.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchInFinally {
public static void main(String[] args) {
	

	Connection con=null;
	try {
		con=DriverManager.getConnection(null);
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}}
