package com.dbs.training.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="audittime")
public class LoginTimeAuditEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="logindtime")
	@CreationTimestamp
	private Timestamp audittime;

	@Column(name="flag")
	private String flag;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="eid",insertable=true,updatable=true)
	public EmployeeEntity emp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getAudittime() {
		return audittime;
	}

	public void setAudittime(Timestamp audittime) {
		this.audittime = audittime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public EmployeeEntity getEmp() {
		return emp;
	}

	public void setEmp(EmployeeEntity emp) {
		this.emp = emp;
	}
	
	

}
