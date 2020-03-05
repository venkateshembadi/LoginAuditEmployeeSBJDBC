package com.emptimetrack.request;

import java.util.Date;

public class EmployeeRequest {
	
	private String ename;
	private String designation;
	private String location;
	private Date swipeIn;
	private Date swipeOut;
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
	
	

}
