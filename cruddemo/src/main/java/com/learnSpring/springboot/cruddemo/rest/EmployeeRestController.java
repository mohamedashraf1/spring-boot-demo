package com.learnSpring.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpring.springboot.cruddemo.entity.Employee;
import com.learnSpring.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;
	
	// quick solution: inject employee dao (construction injection)
	@Autowired
	public EmployeeRestController(EmployeeService thEmployeeService) {
		employeeService = thEmployeeService;
	}
	
	// expose "/employee" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
}








