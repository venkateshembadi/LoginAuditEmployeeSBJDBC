package com.dbs.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.dbs.training.entity.EmployeeEntity;
import com.dbs.training.entity.LoginTimeAuditEntity;
import com.dbs.training.exception.EmployeeException;
import com.dbs.training.exception.GlobalException;
import com.dbs.training.repository.EmployeeRepository;
import com.dbs.training.request.Employee;
import com.dbs.training.request.LoginTimeAudit;

import io.micrometer.core.instrument.util.StringUtils;

@Component
public class EmployeeLoginHoursImpl implements EmployeService {
	
	@Autowired
	public EmployeeRepository empDao;

	@Override
	public Employee saveEmployee(Employee emp) {
		EmployeeEntity entity=null;
		if(emp !=null) {
			entity=new EmployeeEntity();
			Employee employee=mapData(emp,entity);
			empDao.save(entity);
			return employee;
		}
		
		return null;
	}
	
	
	
	@Override
	public Employee updateEmployee(Employee emp, Long eid) throws EmployeeException {
		Employee employee = null;
		// try {
		Optional<EmployeeEntity> empRecord = empDao.findById(eid);
		EmployeeEntity entity = null;
		if (empRecord.isPresent()) {
			entity = new EmployeeEntity();
			entity.setEid(eid);
			employee = mapData(emp, entity);
			empDao.save(entity);
			return employee;

		} else {
			throw new EmployeeException("empRecord doesnt exist");
		}

	
	// catch(Exception e) {
	// throw new EmployeeException("empRecord doesnt exist");
	// }
	//return employee;

	}
	
	public Employee mapData(Employee emp,EmployeeEntity entity) {
		if(StringUtils.isNotBlank(emp.getDesignation())) 
			entity.setDesignation(emp.getDesignation());
		if(StringUtils.isNotBlank(emp.getEname())) 
		entity.setEname(emp.getEname());
		if(StringUtils.isNotBlank(emp.getLocation())) 
		entity.setLocation(emp.getLocation());
		LoginTimeAuditEntity login= new LoginTimeAuditEntity();
		if(!CollectionUtils.isEmpty(emp.getLogin())) {
			for(LoginTimeAudit l:emp.getLogin()) {
				login.setFlag(l.getFlag());
			}
		}
		login.setEmp(entity);
		List<LoginTimeAuditEntity> loginList=new ArrayList<>();
		loginList.add(login);
		entity.setLogin(loginList);
		return emp;
	}
	
	@Override
	public Employee fetchEmployeeDetails(Long eid) {
		Optional<EmployeeEntity> response = empDao.findById(eid);
		Employee e=null;
		if(response.isPresent()) {
			e=new Employee();
			EmployeeEntity entity = response.get();
			e.setDesignation(entity.getDesignation());
			e.setEid(entity.getEid());
			e.setEname(entity.getEname());
			e.setLocation(entity.getLocation());
			LoginTimeAudit loginRes=null;
			List<LoginTimeAudit> loginList=new ArrayList<>();
			for(LoginTimeAuditEntity login:entity.getLogin()) {
				loginRes=new LoginTimeAudit();
				loginRes.setAudittime(login.getAudittime());
				loginRes.setFlag(login.getFlag());
				loginList.add(loginRes);
				e.setLogin(loginList);
			}
			
		}
		return e;
	}
	

}
