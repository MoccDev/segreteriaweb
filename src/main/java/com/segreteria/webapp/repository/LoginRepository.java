package com.segreteria.webapp.repository;

import com.segreteria.webapp.model.Login;
import com.segreteria.webapp.model.Person;

public interface LoginRepository 
{
	public Person makeLogin(Login login);
}
