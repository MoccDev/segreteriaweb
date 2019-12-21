package com.segreteria.webapp.model;

public class Employee extends Person
{
	private static final long serialVersionUID = 220272049362040084L;
	
	private String codEmp;
	private String office;
	
	public String getCodEmp() {
		return codEmp;
	}
	public void setCodEmp(String codEmp) {
		this.codEmp = codEmp;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}

}
