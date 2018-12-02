package com.java.HelloWorld.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.HelloWorld.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
