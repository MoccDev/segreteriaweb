package com.segreteria.webapp.model;

import java.io.Serializable;

public class Exam implements Serializable
{
	private static final long serialVersionUID = 8561228177501982405L;
	
	private int id;
	private String title;
	private boolean mandatory;
	private String teacher;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
}
