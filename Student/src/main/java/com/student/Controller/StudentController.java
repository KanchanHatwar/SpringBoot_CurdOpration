package com.student.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.pojo.Student;
import com.student.service.StudentServiceImpli;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpli studentserviceimpli;

	@PostMapping(value = "/saveStudent")
	public ResponseEntity<Student> saveStudent(Student student) {
		try {
			student = studentserviceimpli.saveStudent(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@GetMapping(value = "/fetchstudent")
	public ResponseEntity<Student> fetchStudent(@RequestBody Student student) {
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1 = studentserviceimpli.getStudentlist();
		return new ResponseEntity(list1, HttpStatus.OK);

	}

	@PostMapping(value = "/updateByroll_no/{roll_no}")
	public ResponseEntity<Student> updtaeStudent(@PathVariable("roll_no") int roll_no) {
		Student student = new Student();
		try {

			student = studentserviceimpli.updateStudentByRoll_no(roll_no, student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}

	@DeleteMapping(value = "/deletestudent/{roll_no}")
	public void deleteStudent(@PathVariable int roll_no) {
		Student student = studentserviceimpli.deleateStudent(roll_no);
	}

}
