package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.GradeEntity;
import com.rest.persistance.GradeRepository;
import com.rest.services.GradeService;

@Service
public class GradeServiceImpl implements GradeService{

	@Autowired
	private GradeRepository repository;

	@Override
	public GradeEntity getGradeById(int id) {
		return repository.findByGradeId(id);
	}
	
}
