package com.raystech.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallStoredFunction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		CallableStatement cs = con.prepareCall("{?=CALL hc()}");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println(cs.getInt(1));
		cs.close();
		con.close();
	}

}
