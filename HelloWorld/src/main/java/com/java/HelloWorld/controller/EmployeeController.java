package com.java.HelloWorld.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.HelloWorld.Dao.EmployeeDao;
import com.java.HelloWorld.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return employeeDao.save(emp);
		
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> gettAllEmployees() {
		return employeeDao.findAll();
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long empId) {
		Employee emp=employeeDao.findOne(empId);
		if (emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empId,@Valid @RequestBody Employee empDetalis){
		
		Employee emp=employeeDao.findOne(empId);
		if (emp==null) {
			return ResponseEntity.notFound().build();
		}
		emp.setName(empDetalis.getName());
		emp.setDesignation(empDetalis.getDesignation());
		emp.setExpertise(empDetalis.getExpertise());
		
		Employee updateEmployee=employeeDao.save(emp);
		return ResponseEntity.ok().body(updateEmployee);
		
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Long empId){
		Employee emp=employeeDao.findOne(empId);
		if (emp==null) {
			return ResponseEntity.notFound().build();
		}
		employeeDao.delete(emp);
		return ResponseEntity.ok().build();
		
	}
}
