package com.gharguti.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gharguti.api.QueryConstant;
import com.gharguti.api.database.DBConnect;
import com.gharguti.api.model.LoginBean;
import com.gharguti.api.model.RegistrationBean;

public class GhargutiDaoImpl implements GhargutiDao {

	@Override
	public boolean checkUserLogin(LoginBean loginBean) throws SQLException {
		String status = null;
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.connect();
		PreparedStatement ps = con.prepareStatement(QueryConstant.Login_User);
		ps.setString(1, loginBean.getUsername());
		ps.setString(2, loginBean.getPassword());
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			status = rs.getString("status");
		}
		ps.close();
		rs.close();
		 dbConnect.disconnect();
		return status == null ? false : true;
	}

	@Override
	public boolean userRegistration(RegistrationBean registrationBean) throws SQLException {
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.connect();
		PreparedStatement ps = con.prepareStatement(QueryConstant.REGISTER_USER);
		ps.setString(1, registrationBean.getUsername());
		ps.setString(2, registrationBean.getPassword());
		ps.setString(3, registrationBean.getFirstname());
		ps.setString(4, registrationBean.getLastname());
		ps.setString(5, registrationBean.getMobile());
		ps.setString(6, registrationBean.getEmail());
		ps.setString(7, registrationBean.getAddress());
		ps.setString(8, "A");
		boolean rowInserted = ps.executeUpdate() > 0;
        ps.close();
        dbConnect.disconnect();
        return rowInserted;
	}

}
