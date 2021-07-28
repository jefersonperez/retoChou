package com.choucair.formacion.models;

public class Login {
	public String user;
	public String password;
	
	
	public Login(String user, String password) {
		super();
		this.user = user;
		this.password = password;
		
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	
	
	
}
