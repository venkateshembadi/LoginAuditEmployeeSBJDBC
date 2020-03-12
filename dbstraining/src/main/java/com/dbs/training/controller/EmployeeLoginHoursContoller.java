package com.dbs.training.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.training.entity.EmployeeEntity;
import com.dbs.training.exception.EmployeeException;
import com.dbs.training.request.Employee;
import com.dbs.training.service.EmployeeLoginHoursImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeLoginHoursContoller {
	
	@Autowired
	public EmployeeLoginHoursImpl loginHours;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@Valid @RequestBody Employee request) {
		Employee employee = loginHours.saveEmployee(request);
		return ResponseEntity.ok().body(employee);
	}
	
	@PutMapping("/update/{eid}")
	public ResponseEntity<?> updateEmployee(@Valid @RequestBody Employee request,@PathVariable Long eid) {
		Employee employee = loginHours.updateEmployee(request,eid);
		return ResponseEntity.ok().body(employee);
	}
	
	
	@GetMapping("/fetch/{eid}")
	public ResponseEntity<?> fetchEmployeeDetails(@PathVariable Long eid) throws EmployeeException{
		Employee response = loginHours.fetchEmployeeDetails(eid);
		return ResponseEntity.ok().body(response);
	}

}
