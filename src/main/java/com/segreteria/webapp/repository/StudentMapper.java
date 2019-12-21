package com.segreteria.webapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.segreteria.webapp.model.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Student student = new Student();
		
		try
		{
			student.setId(rs.getInt("id"));
			student.setFirstName(rs.getString("firstName"));
			student.setLastName(rs.getString("lastName"));
			student.setAddress(rs.getString("address"));
			student.setDateBirth(rs.getDate("dateBirth"));
			student.setSerialNumber(rs.getString("serialNumber"));
			student.setDiplomaGrade(rs.getInt("diplomaGrade"));
			student.setIdDegree(rs.getInt("idDegree"));
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return student;
	}

}
