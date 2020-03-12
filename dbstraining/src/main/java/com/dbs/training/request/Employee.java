package com.dbs.training.request;

import java.util.List;

import javax.validation.constraints.NotBlank;

public class Employee {
	
	private Long eid;

	@NotBlank(message = "Ename cannot be null")
	private String ename;

	@NotBlank(message = "Designation cannot be null")
	private String designation;

	@NotBlank(message = "Location cannot be null")
	private String location;
	
	public List<LoginTimeAudit> login;

	/*
	 * private Date swipeIn;
	 * 
	 * private Date swipeOut;
	 */
	 
	

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	public List<LoginTimeAudit> getLogin() {
		return login;
	}

	public void setLogin(List<LoginTimeAudit> login) {
		this.login = login;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}
	
	

	/*public Date getSwipeIn() {
		return swipeIn;
	}

	public void setSwipeIn(Date swipeIn) {
		this.swipeIn = swipeIn;
	}

	public Date getSwipeOut() {
		return swipeOut;
	}

	public void setSwipeOut(Date swipeOut) {
		this.swipeOut = swipeOut;
	}*/

	
}
