package com.gharguti.api.dao;

import java.sql.SQLException;

import com.gharguti.api.model.LoginBean;
import com.gharguti.api.model.RegistrationBean;

public interface GhargutiDao {
	
	public boolean checkUserLogin(LoginBean loginBean) throws SQLException;
	
	public boolean userRegistration(RegistrationBean registrationBean) throws SQLException;

}
