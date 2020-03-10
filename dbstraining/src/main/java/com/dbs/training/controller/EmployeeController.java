package com.dbs.training.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.training.exception.EmployeeException;
import com.dbs.training.exception.LoginAuditException;
import com.dbs.training.request.Employee;
import com.dbs.training.request.LoginTimeAudit;
import com.dbs.training.service.EmployeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeService empservice;

	@PostMapping("/employe")
	public ResponseEntity<?> saveEmployee(@Valid @RequestBody Employee request) {
		long employee = empservice.saveEmployee(request);
		return ResponseEntity.ok().body(employee);
	}

	@PutMapping("/employeeswipe/{eid}")
	public ResponseEntity<?> updateSwapeHours(@RequestBody Employee request,@PathVariable Long eid) {

		long employee;
		try {
			employee = empservice.updateSwipeHours(request,eid);
		} catch (Exception e) {
			throw new EmployeeException("Unable to update employee details");
		}
		return ResponseEntity.ok().body(employee);

	}

	@PutMapping("/loginaudit")
	public ResponseEntity<?> loginSwapeHours(@RequestBody LoginTimeAudit request) {
		long employee;
		try {
			employee = empservice.auditsave(request);
		} catch (Exception e) {
			throw new LoginAuditException("Unable to save loginAudit details");
		}

		return ResponseEntity.ok().body(employee);
	}

}
