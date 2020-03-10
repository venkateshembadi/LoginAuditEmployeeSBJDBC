package com.dbs.training.service;


import org.springframework.stereotype.Component;

import com.dbs.training.request.Employee;
import com.dbs.training.request.LoginTimeAudit;

@Component
public interface EmployeService {
	
	long saveEmployee(Employee emp);
	
	long updateSwipeHours(Employee emp,Long eid);
	
	int auditsave(LoginTimeAudit login);
	
	int getempById(Long id);

}
