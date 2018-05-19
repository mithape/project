package com.gharguti.api.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	Connection con = null;

	public Connection connect() throws SQLException {

		if (con == null || con.isClosed()) {
			try {				
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.setLoginTimeout(2);
				con = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12238807",
						"sql12238807", "7E5GNvK655");
			} catch (Exception e) {

			}
		}
		return con;
	}

	public void disconnect() throws SQLException {
		if (con != null && !con.isClosed()) {
			con.close();
        }
	}
}
