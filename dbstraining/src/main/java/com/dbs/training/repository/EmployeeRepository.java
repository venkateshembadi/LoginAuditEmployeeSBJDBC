package com.dbs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.training.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
