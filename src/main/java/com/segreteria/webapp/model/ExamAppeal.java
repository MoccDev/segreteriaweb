package com.segreteria.webapp.model;

import java.io.Serializable;
import java.sql.Date;

public class ExamAppeal implements Serializable
{
	private static final long serialVersionUID = 2246573429685565754L;
	
	private int id;
	private int idExam;
	private Date date;
	private String codEmployee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdExam() {
		return idExam;
	}
	public void setIdExam(int idExam) {
		this.idExam = idExam;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCodEmployee() {
		return codEmployee;
	}
	public void setCodEmployee(String codEmployee) {
		this.codEmployee = codEmployee;
	}

}
