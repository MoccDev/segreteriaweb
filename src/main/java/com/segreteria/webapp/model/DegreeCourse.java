package com.segreteria.webapp.model;

import java.io.Serializable;

public class DegreeCourse implements Serializable
{
	private static final long serialVersionUID = 5209761073651650256L;
	
	private int id;
	private String title;
	
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
}
