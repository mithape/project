package com.gharguti.api;

public class QueryConstant {

	public static final String REGISTER_USER = "insert into user_registration (username,password,firstname,lastname,mobile,email,address,status) values (?,?,?,?,?,?,?,?)";
	public static final String Login_User = "select status from user_registration where username = ? and password = ?";
}
