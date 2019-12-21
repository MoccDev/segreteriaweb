package com.segreteria.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segreteria.webapp.model.Login;
import com.segreteria.webapp.model.Person;
import com.segreteria.webapp.model.Student;
import com.segreteria.webapp.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Student makeLogin(Login login) 
	{
		return (Student) loginRepository.makeLogin(login);
	}

}
