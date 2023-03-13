package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.pojo.Student;
@Repository
public interface  StudentRespository extends JpaRepository<Student, Integer> {

}
