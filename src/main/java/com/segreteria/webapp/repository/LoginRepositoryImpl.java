package com.segreteria.webapp.repository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.segreteria.webapp.model.Login;
import com.segreteria.webapp.model.Student;

@Repository
public class LoginRepositoryImpl implements LoginRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Student makeLogin(Login login) 
	{	
		String sql = "SELECT * FROM PERSON P JOIN STUDENT S ON P.ID = S.IDPERSON WHERE P.EMAIL = ? AND PASSWORD = ?";
		
		return jdbcTemplate.query(sql, new Object[] {login.getEmail(), login.getPassword()}, new StudentMapper()).get(0);
		
	}

}
