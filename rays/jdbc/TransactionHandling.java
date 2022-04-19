package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {

	public static void main(String[] args) {

		Connection conn = null;
		int pk = 0;

		try {
			conn = JDBCDataSourceExm.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("insert into user values(1,'shubham','Indore')");
			
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {
				JDBCDataSourceExm.closeConnection(conn);
		        
			}
			e.printStackTrace();
		}

	}

}
