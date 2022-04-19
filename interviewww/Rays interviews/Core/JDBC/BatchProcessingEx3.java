package com.raystech.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BatchProcessingEx3 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {

	 try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		CallableStatement cs = con.prepareCall("{CALL b(?,?)}");

		cs.setInt(1, 4);
		cs.setString(2, "cityy");
		cs.addBatch();
		
		cs.setInt(1, 5);
		cs.setString(2, "ffdcityy");
		cs.addBatch();
	 
		int[] i = cs.executeBatch();
	
		System.out.println("Successful");
	} catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

}
