package com.java.HelloWorld.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.HelloWorld.Pojo.Student;

@Repository
public interface IStudentDao {

	List<Student> getStudents();

}
