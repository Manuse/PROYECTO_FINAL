package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.SubjectEntity;
import com.rest.persistance.SubjectRepository;
import com.rest.services.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectRepository repository;

	@Override
	public SubjectEntity getSubjectById(int id) {
		return repository.findBySubjectId(id);
	}
	
}
