package com.learnSpring.springboot.cruddemo.dao;

import java.util.List;

import com.learnSpring.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
}
