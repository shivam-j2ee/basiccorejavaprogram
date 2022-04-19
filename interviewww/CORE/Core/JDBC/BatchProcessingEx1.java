package com.raystech.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		Statement st = con.createStatement();
		st.addBatch("insert into user values(8,'Cahal','Aukha','chal@gmail.com','ChalPass')");
		st.addBatch("insert into user values(9,'Dipesh','Paum','chalHut@Rediff.com','ChalHut')");
		st.addBatch("insert into user values(10,'Vikas','Yatra','chalFut@g.com','ChalFut')");
		st.addBatch("insert into user values(11,'Nipul','Singh','chalJa@yahoo.com','ChalJa')");
		
		int[] i=st.executeBatch();
		System.out.println("Batch Processing is done successfully using Statement.... ");
		
	}

}
