package com.student.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.pojo.Student;
import com.student.repository.StudentRespository;
@Service
public class StudentServiceImpli implements StudentService {
@Autowired
	private  StudentRespository studentrespository;
private ArrayList<Student> students;

@Override
public Student saveStudent(Student student) {
	
	 try {
		 student=studentrespository.save(student);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return student;
}


	@Override
	public ArrayList<Student> getStudentlist() {
		
		ArrayList<Student> list=new ArrayList<Student>();
		list=(ArrayList<Student>) studentrespository.findAll();
		return list;
	}




	@Override
	public Student updateStudentByRoll_no(int roll_no, Student student) {
		
		for(int i=0;i<students.size();i++)
		{
			Student s=students.get(i);
			if(s.equals(student))
			{
				students.set(i, student);
			}
		}
		return student;
		
		
	}


	@Override
	public Student  deleateStudent(int roll_no) {
		//Student student=new Student();
		try {
		Iterator<Student> iterator=students.iterator();
		while(iterator.hasNext())
		{
			Student student=iterator.next();
			if(student.getRoll_no()==roll_no)
			{
				iterator.remove();
				return student;
			}
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	
	}


}
