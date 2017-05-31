package com.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rest.model.SubjectEntity;
import com.rest.persistance.SubjectRepository;
import com.rest.services.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public SubjectEntity getSubjectById(int id) {
		return repository.findBySubjectId(id);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void saveSubject(SubjectEntity entity) {
		try {
			repository.save(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteSubject(SubjectEntity entity) {
		try {
			repository.delete(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	public List<SubjectEntity> listSubject() {
		return repository.findAll();
	}

	@Override
	public SubjectEntity getSubjectByCode(String code) {
		return repository.findByCode(code);
	}
	
}
