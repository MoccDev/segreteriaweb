package com.segreteria.webapp.model;

public class Student extends Person
{
	private static final long serialVersionUID = -4364252867115649566L;
	
	private String serialNumber;
	private int diplomaGrade; 
	private int idDegree;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getDiplomaGrade() {
		return diplomaGrade;
	}
	public void setDiplomaGrade(int diplomaGrade) {
		this.diplomaGrade = diplomaGrade;
	}
	public int getIdDegree() {
		return idDegree;
	}
	public void setIdDegree(int idDegree) {
		this.idDegree = idDegree;
	}

}
