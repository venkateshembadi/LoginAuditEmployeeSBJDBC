package com.dbs.training.request;

import java.sql.Timestamp;

public class LoginTimeAudit {
	
	private Long id;
	private Long eid;
	private Timestamp audittime;
	private String flag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
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
	
	
	
}
