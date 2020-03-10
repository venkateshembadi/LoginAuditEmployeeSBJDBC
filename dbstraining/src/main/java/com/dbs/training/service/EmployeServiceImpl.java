package com.dbs.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dbs.training.request.Employee;
import com.dbs.training.request.LoginTimeAudit;

@Component
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public long saveEmployee(Employee emp){
		
		return jdbcTemplate.update("insert into EmployeeEntity (ename, location,designation) values(?,?,?)",
				emp.getEname(), emp.getLocation(), emp.getDesignation());
	}

	@Override
	public long updateSwipeHours(Employee emp,Long eid) {
		return jdbcTemplate.update("update EmployeeEntity set emp.getEname(), emp.getLocation(), emp.getDesignation() where emp.getEid=eid");
				
	}

	
	@Override
	public int auditsave(LoginTimeAudit auditsave) {
		int count=getempById(auditsave.getEid());
		if(count !=0) {
			return jdbcTemplate.update(
	                "insert into logintimeaudit (eid,flag) values(?,?)",
	                auditsave.getEid(),auditsave.getFlag());
		}else {
			return 0;
		}
	}

		@Override
		public int getempById(Long id) {
			return jdbcTemplate.queryForObject(
	                "select count(*) from employee where eid = ?",
	                new Object[]{id},
	                Integer.class
	        );
		}
	
	}

