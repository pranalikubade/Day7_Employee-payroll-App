package com.bridgelabz.Employee.Payroll.App;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
		log.info("Welcome to SpringBoot");
		log.debug("Debug level");
		log.error("Error level");
		log.warn("Warn level");
	}

}
