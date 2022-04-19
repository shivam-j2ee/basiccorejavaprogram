package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSourceExm {

	private static JDBCDataSourceExm datasource;

	private JDBCDataSourceExm() {
	}

	private ComboPooledDataSource cpds = null;

	public static JDBCDataSourceExm getInstance() {

		if (datasource == null) {
			ResourceBundle rb = ResourceBundle.getBundle("com.rays.proj3.bundle.system");

			datasource = new JDBCDataSourceExm();
			datasource.cpds = new ComboPooledDataSource();

			try {
				datasource.cpds.setDriverClass(rb.getString("driver"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			datasource.cpds.setJdbcUrl(rb.getString("url"));
			datasource.cpds.setAcquireIncrement(new Integer(rb.getString("acquireIncrement")));
			datasource.cpds.setMaxPoolSize(new Integer(rb.getString("maxPoolSize")));
			datasource.cpds.setMinPoolSize(new Integer(rb.getString("minPoolSize")));

		}
		return datasource;
	}

	
	public static Connection getConnection() throws Exception {

		return getInstance().cpds.getConnection();
	}
	

	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
