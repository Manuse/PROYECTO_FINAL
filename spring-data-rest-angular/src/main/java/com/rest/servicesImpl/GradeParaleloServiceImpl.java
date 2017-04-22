package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.GradeParaleloEntity;
import com.rest.persistance.GradeParaleloRepository;
import com.rest.services.GradeParaleloService;

@Service
public class GradeParaleloServiceImpl implements GradeParaleloService {
	
	@Autowired
	private GradeParaleloRepository repository;

	@Override
	public GradeParaleloEntity getGradeParaleloById(int id) {
		return repository.findByGradeParaleloId(id);
	}	
	
}
