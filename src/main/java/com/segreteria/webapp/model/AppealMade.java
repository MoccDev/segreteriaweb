package com.segreteria.webapp.model;

import java.io.Serializable;

public class AppealMade implements Serializable
{
	private static final long serialVersionUID = -2888273760114298094L;
	
	private String serialNumberStudent;
	private int idAppeal;
	private int grade;
	
	public String getSerialNumberStudent() {
		return serialNumberStudent;
	}
	public void setSerialNumberStudent(String serialNumberStudent) {
		this.serialNumberStudent = serialNumberStudent;
	}
	public int getIdAppeal() {
		return idAppeal;
	}
	public void setIdAppeal(int idAppeal) {
		this.idAppeal = idAppeal;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
