package com.raystech.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchMultipleValueUsingStoredProcedureAsMultipleResultSet {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		CallableStatement cs = con.prepareCall("{CALL getAllPart()}");
		cs.execute();
		ResultSet rs = cs.getResultSet();
		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));			
		}
		rs.close();
		cs.close();
		con.close();
		
	}

}
