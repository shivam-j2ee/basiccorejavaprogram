package Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchFinally 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(null);
		} catch (SQLException e) {

			e.printStackTrace();
		}finally 
		{
			System.out.println("Finally Block");
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
