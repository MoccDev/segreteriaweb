package com.segreteria.webapp.model;

import java.io.Serializable;

public class ExamDegree implements Serializable
{
	private static final long serialVersionUID = -2471099473756598710L;
	
	private int idExam;
	private int idDegree;
	private int cfu;
	
	public int getIdExam() {
		return idExam;
	}
	public void setIdExam(int idExam) {
		this.idExam = idExam;
	}
	public int getIdDegree() {
		return idDegree;
	}
	public void setIdDegree(int idDegree) {
		this.idDegree = idDegree;
	}
	public int getCfu() {
		return cfu;
	}
	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
	
	

}
