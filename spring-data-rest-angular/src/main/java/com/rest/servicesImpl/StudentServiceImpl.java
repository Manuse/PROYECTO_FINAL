package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.StudentEntity;
import com.rest.persistance.StudentRepository;
import com.rest.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentEntity getStudentById(int id) {
		return repository.findByStudentId(id);
	}
	
}
