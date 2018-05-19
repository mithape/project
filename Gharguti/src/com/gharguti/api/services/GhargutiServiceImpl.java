package com.gharguti.api.services;

import java.sql.SQLException;

import com.gharguti.api.dao.GhargutiDao;
import com.gharguti.api.dao.GhargutiDaoImpl;
import com.gharguti.api.model.LoginBean;
import com.gharguti.api.model.RegistrationBean;

public class GhargutiServiceImpl implements GhargutiService {

	GhargutiDao ghargutiDao = null;
	
	@Override
	public boolean checkUserLogin(LoginBean loginBean) throws SQLException {
		ghargutiDao = new GhargutiDaoImpl();
		return ghargutiDao.checkUserLogin(loginBean);
	}

	@Override
	public boolean userRegistration(RegistrationBean registrationBean) throws SQLException {
		ghargutiDao = new GhargutiDaoImpl();
		return ghargutiDao.userRegistration(registrationBean);
	}

}
