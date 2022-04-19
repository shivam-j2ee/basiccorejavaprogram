package com.raystech.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingEx2 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {

		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
		
		ps.setInt(1, 10);
		ps.setString(2, "Nimit");
		ps.setString(3, "Saki");
		ps.setString(4, "nimit@gmail.com");
		ps.setString(5, "nimittP");

		ps.addBatch();
		int[] i = ps.executeBatch();

		System.out.println("Batch Processing is done successfully using Prepared Statement....");
		}catch(Exception e){
			e.printStackTrace();
		}	
	}

}
