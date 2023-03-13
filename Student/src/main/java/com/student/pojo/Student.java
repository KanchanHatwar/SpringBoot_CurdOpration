package com.student.pojo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
@Entity
@Table(name="student")
public class Student {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int roll_no;
	 @Column(name="name")
	 private String name;
	 private String lastname;
	public Student(int roll_no, String name, String lastname) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.lastname = lastname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	 
	 
}
