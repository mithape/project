package com.gharguti.api.services;

import java.sql.SQLException;

import com.gharguti.api.model.LoginBean;
import com.gharguti.api.model.RegistrationBean;

public interface GhargutiService {

	public boolean checkUserLogin(LoginBean loginBean) throws SQLException;
	
	public boolean userRegistration(RegistrationBean registrationBean) throws SQLException;
	
}
