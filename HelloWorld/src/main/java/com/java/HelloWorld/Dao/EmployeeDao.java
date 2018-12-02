package com.java.HelloWorld.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.HelloWorld.Repository.EmployeeRepository;
import com.java.HelloWorld.model.Employee;

@Service
public class EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
