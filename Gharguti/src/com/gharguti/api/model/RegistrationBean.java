package com.gharguti.api.model;

public class RegistrationBean {
	
	private int attemptCount; 
	private String status;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String mobile;
	private String email;
	private String address;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username == null ? "" : username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password == null ? "" : password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname == null ? "" : firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname == null ? "" : lastname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? "" : mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email == null ? "" : email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address == null ? "" : address;
	}
	public int getAttemptCount() {
		return attemptCount;
	}
	public void setAttemptCount(int attemptCount) {
		this.attemptCount = attemptCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
