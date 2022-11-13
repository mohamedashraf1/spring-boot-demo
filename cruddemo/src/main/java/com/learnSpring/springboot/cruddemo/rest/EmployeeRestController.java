package com.learnSpring.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpring.springboot.cruddemo.dao.EmployeeDAO;
import com.learnSpring.springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO employeeDAO;
	
	// quick solution: inject employee dao (construction injection)
	@Autowired
	public EmployeeRestController(EmployeeDAO thEmployeeDAO) {
		employeeDAO = thEmployeeDAO;
	}
	
	// expose "/employee" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
	
}








