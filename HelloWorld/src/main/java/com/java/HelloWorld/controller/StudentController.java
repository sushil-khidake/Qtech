package com.java.HelloWorld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.HelloWorld.Dao.IStudentDao;
import com.java.HelloWorld.Pojo.Student;

@RestController
public class StudentController {
	
	@Autowired
	IStudentDao studentdao;
	
	@RequestMapping(value="student",method=RequestMethod.GET)
	public List<Student> getStudentDetails(){
		
		List<Student> studentList=studentdao.getStudents();
		return studentList;
		
	}
	
}
