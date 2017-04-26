package com.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rest.model.GradeEntity;
import com.rest.persistance.GradeRepository;
import com.rest.services.GradeService;

@Service
public class GradeServiceImpl implements GradeService{

	@Autowired
	private GradeRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GradeEntity getGradeById(int id) {
		return repository.findByGradeId(id);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void saveGrade(GradeEntity entity) {
		try{
			repository.save(entity);
		}catch(DataAccessException e){}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteGrade(GradeEntity entity) {
		try {
			repository.delete(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	public List<GradeEntity> listGrade() {
		return repository.findAll();
	}
	
}
