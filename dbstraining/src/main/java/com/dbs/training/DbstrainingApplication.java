package com.dbs.training;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages= {"com.dbs.training.service.EmployeServiceImpl","com.dbs.training.controller","com.dbs.training.service"})
public class DbstrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbstrainingApplication.class, args);
	}
	
	

	
}
