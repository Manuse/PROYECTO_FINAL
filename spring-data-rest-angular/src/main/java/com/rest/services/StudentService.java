package com.rest.services;

import java.util.List;

import com.rest.model.StudentEntity;

public interface StudentService {

	StudentEntity getStudentById(int id);
	
	void saveStudent(StudentEntity entity);
	
	void deleteStudent(StudentEntity entity);
	
	List<StudentEntity> listStudent();
	
	StudentEntity login(String email, String pass);
	
}
