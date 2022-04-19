package com.raystech.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ResultSetMetaDataEx {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		PreparedStatement ps = con.prepareStatement("select * from user");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData m = rs.getMetaData();
		System.out.println("Catalog Name : " + m.getCatalogName(1));
		System.out.println("Table Name : " + m.getTableName(1));
		int columnCount = m.getColumnCount();
		System.out.println("Column Count " + columnCount);
		
		for(int i=1;i<=columnCount;i++){
			System.out.println("Column : " + (i));
			System.out.println("Column Label : " + m.getColumnLabel(i));
			System.out.println("Column Type Name : " + m.getColumnTypeName(i));
			System.out.println("Column Display Size : " + m.getColumnDisplaySize(i));
			System.out.println("Column Precision Type : " + m.getPrecision(i));
			
			
		}
		
		rs.close();
		ps.close();
		con.close();
	}

}
