package com.raystech.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {

	public static void main(String[] args)throws SQLException, ClassNotFoundException{

		Class.forName("com.mysql.jdbc.Driver");
		Connection con =null;  /*DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");*/
		PreparedStatement pstmt = null;
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
			con.setAutoCommit(false);
			pstmt = con.prepareStatement("Insert into user values(7,'Mohit','Jain','mohit@g.com','root')");
			pstmt.executeUpdate();
			
			con.commit();
			System.out.println("Inserted Successfully.....");
		}catch(SQLException e){
			con.rollback();
			e.printStackTrace();
		}finally {
			pstmt.close();
			con.close();
		}
			
	}

}
