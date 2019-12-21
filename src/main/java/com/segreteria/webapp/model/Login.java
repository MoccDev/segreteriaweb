package com.segreteria.webapp.model;

import java.io.Serializable;

public class Login implements Serializable
{
	private static final long serialVersionUID = -1708768162246378097L;
	
	private String email;
	private String password;
	private String error;
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	

}
