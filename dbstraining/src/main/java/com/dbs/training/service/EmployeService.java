package com.dbs.training.service;


import java.util.Optional;

import org.springframework.stereotype.Component;

import com.dbs.training.entity.EmployeeEntity;
import com.dbs.training.request.Employee;
import com.dbs.training.request.LoginTimeAudit;

@Component
public interface EmployeService {
	
	//long saveEmployee(Employee emp);
	
	//long updateSwipeHours(Employee emp,Long eid);
	
	//int auditsave(LoginTimeAudit login);
	
	//int getempById(Long id);
	
	Employee saveEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp,Long eid);
	
	Employee fetchEmployeeDetails(Long id);
}
