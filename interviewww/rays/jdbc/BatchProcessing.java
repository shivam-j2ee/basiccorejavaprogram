package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql:localhost//3306/DataBase","root","root");
		conn.setAutoCommit(false);
		
/*		Batch Processing Using Statement  */
		Statement stmt = conn.createStatement();
		stmt.addBatch("Insert into user values(1,'ram','indore')");
		stmt.addBatch("Insert into user values(2,'varun','mumbai')");
		
		int a[] = stmt.executeBatch();
		System.out.println("Batch Processing Done");
		
		
		
/*		Batch Processing Using PreparedStatement */
		PreparedStatement st = conn.prepareStatement(null, 0);
		st.setLong(1, 10);
		st.setString(2, "Shubham");
		st.setInt(3, 25);
		st.addBatch();
		
		st.setLong(1, 15);
		st.setString(2, "Ram");
		st.setInt(3, 30);
		st.addBatch();
		
		int b[] = st.executeBatch();
		
		
		
		conn.commit();
		conn.close();
		
	}
}
