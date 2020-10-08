package io.jpatest.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.jpatest.demo.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int id){
		 Employee employee = new Employee("admin", "admin", "admin@gmail.com");
		 return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
}
