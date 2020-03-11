package com.dbs.training.request;

import java.sql.Timestamp;

public class LoginTimeAudit {

	private Timestamp audittime;

	private String flag;


	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Timestamp getAudittime() {
		return audittime;
	}

	public void setAudittime(Timestamp audittime) {
		this.audittime = audittime;
	}
	
	

}
