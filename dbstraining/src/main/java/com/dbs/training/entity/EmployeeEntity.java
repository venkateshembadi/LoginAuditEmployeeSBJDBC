package com.dbs.training.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbs.training.request.LoginTimeAudit;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eid;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="destination")
	private String designation;
	
	@Column(name="location")
	private String location;
	
	/*
	 * private Date swipeIn;
	 * 
	 * private Date swipeOut;
	 */
	
	@OneToMany(mappedBy = "emp",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	public List<LoginTimeAuditEntity> login;

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

	public List<LoginTimeAuditEntity> getLogin() {
		return login;
	}

	public void setLogin(List<LoginTimeAuditEntity> login) {
		this.login = login;
	}

	/*
	 * public Date getSwipeIn() { return swipeIn; }
	 * 
	 * public void setSwipeIn(Date swipeIn) { this.swipeIn = swipeIn; }
	 * 
	 * public Date getSwipeOut() { return swipeOut; }
	 * 
	 * public void setSwipeOut(Date swipeOut) { this.swipeOut = swipeOut; }
	 */

	
}
