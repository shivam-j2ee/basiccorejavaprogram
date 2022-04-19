package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class List_Exm {
	
	public List list(int pageNo, int pageSize) {
		
		ArrayList list = new ArrayList();
		StringBuffer sql = new StringBuffer("select * from user");
		
		if(pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append("limit"+ pageNo +","+pageSize);
		}
		
		Connection conn = null;
		
		try {
			conn = JDBCDataSourceExm.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getLong(1));
                dto.setFirstName(rs.getString(2));
                dto.setLastName(rs.getString(3));
                dto.setLogin(rs.getString(4));
                dto.setPassword(rs.getString(5));
                
                list.add(dto);
			}
			rs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}

}
