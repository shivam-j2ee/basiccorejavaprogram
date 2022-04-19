package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NextPK_Exm {
	public static void main(String[] args) {
		nextPK();
	}
	
	public static long nextPK() {
		
		Connection conn = null;
		int pk = 0;
		
		try {
			conn = JDBCDataSourceExm.getConnection();
		
			PreparedStatement pstmt = conn.prepareStatement("select max(id) from user");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		}
		
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally {
			JDBCDataSourceExm.closeConnection(conn);
		}
		
		return pk + 1;
		
	}

}
