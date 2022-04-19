package com.raystech.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallStoredProcedure {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		CallableStatement cs = con.prepareCall("{CALL d(?,?)}");
		
		//Set IN Parameter
		cs.setInt(1, 4);
		
		//Register OUT Parameter
		cs.registerOutParameter(2, Types.VARCHAR);
		
		//Execute Procedure
		cs.execute();
		
		//Fetch Out Parameter
		System.out.println(cs.getString(2));
		cs.close();
		con.close();
		
		
	}

}
