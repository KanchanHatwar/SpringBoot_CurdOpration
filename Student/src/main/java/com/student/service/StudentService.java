package com.student.service;

import java.util.ArrayList;

import com.student.pojo.Student;

public interface StudentService {
   
	Student saveStudent(Student student);
	ArrayList<Student>getStudentlist();
	
	Student updateStudentByRoll_no(int roll_no, Student student);
	 
Student deleateStudent(int roll_no);
}
