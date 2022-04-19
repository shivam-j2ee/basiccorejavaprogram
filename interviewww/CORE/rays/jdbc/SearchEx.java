package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SearchEx {
	  public List search(UserDTO dto, int pageNo, int pageSize) {
	       
	        StringBuffer sql = new StringBuffer("SELECT * FROM ST_USER WHERE 1=1");

	        if (dto != null) {
	            if (dto.getId() > 0) {
	                sql.append(" AND id = " + dto.getId());
	            }
	            if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
	                sql.append(" AND FIRST_NAME like '" + dto.getFirstName() + "%'");
	            }
	            if (dto.getLastName() != null && dto.getLastName().length() > 0) {
	                sql.append(" AND LAST_NAME like '" + dto.getLastName() + "%'");
	            }
	            if (dto.getLogin() != null && dto.getLogin().length() > 0) {
	                sql.append(" AND LOGIN like '" + dto.getLogin() + "%'");
	            }
	            if (dto.getPassword() != null && dto.getPassword().length() > 0) {
	                sql.append(" AND PASSWORD like '" + dto.getPassword() + "%'");
	            }
	          
	        }

	        if (pageSize > 0) {
	            pageNo = (pageNo - 1) * pageSize;
	            sql.append(" Limit " + pageNo + ", " + pageSize);
	        }

	        ArrayList list = new ArrayList();
	        Connection conn = null;
	        try {
	            conn = JDBCDataSourceExm.getConnection();
	            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	            ResultSet rs = pstmt.executeQuery();
	            while (rs.next()) {
	                dto = new UserDTO();
	                dto.setId(rs.getLong(1));
	                dto.setFirstName(rs.getString(2));
	                dto.setLastName(rs.getString(3));
	                dto.setLogin(rs.getString(4));
	                dto.setPassword(rs.getString(5));
	               
	                list.add(dto);
	            }
	            rs.close();
	        } catch (Exception e) {
	           
	        } finally {
	            JDBCDataSourceExm.closeConnection(conn);
	        }

	        return list;
	    }


}