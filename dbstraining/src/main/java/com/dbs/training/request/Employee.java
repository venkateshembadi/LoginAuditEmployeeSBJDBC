package com.dbs.training.request;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Employee {

	private Long eid;
	private String ename;
	private String designation;
	private String location;
	private Date swipeIn;
	private Date swipeOut;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	public List<LoginTimeAudit> login;

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

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

	public Date getSwipeIn() {
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
	}

	public List<LoginTimeAudit> getLogin() {
		return login;
	}

	public void setLogin(List<LoginTimeAudit> login) {
		this.login = login;
	}

}
