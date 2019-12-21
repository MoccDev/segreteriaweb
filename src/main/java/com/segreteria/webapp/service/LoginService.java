package com.segreteria.webapp.service;


import com.segreteria.webapp.model.Login;
import com.segreteria.webapp.model.Person;
import com.segreteria.webapp.model.Student;

public interface LoginService 
{
	public Student makeLogin(Login login);
}
