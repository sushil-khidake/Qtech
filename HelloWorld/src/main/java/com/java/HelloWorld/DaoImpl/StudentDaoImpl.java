package com.java.HelloWorld.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.HelloWorld.Dao.IStudentDao;
import com.java.HelloWorld.Pojo.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Override
	public List<Student> getStudents() {
		List<Student> studentList=new ArrayList<>();
		Student s1=new Student();
		s1.setFname("Sushil");
		s1.setMname("Laxman");
		s1.setLname("Khidake");
		s1.setRollno(37);
		s1.setSubject("Mathematics");
		s1.setCourse("MCA");
		
		Student s2=new Student();
		s2.setFname("Swapil");
		s2.setMname("Laxman");
		s2.setLname("Khidake");
		s2.setRollno(30);
		s2.setSubject("Java");
		s2.setCourse("BSC-Cs");
		
		studentList.add(s1);
		studentList.add(s2);
		return studentList;
	}

}
