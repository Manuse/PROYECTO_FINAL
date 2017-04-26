package com.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rest.model.GradeParaleloEntity;
import com.rest.persistance.GradeParaleloRepository;
import com.rest.services.GradeParaleloService;

@Service
public class GradeParaleloServiceImpl implements GradeParaleloService {
	
	@Autowired
	private GradeParaleloRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GradeParaleloEntity getGradeParaleloById(int id) {
		return repository.findByGradeParaleloId(id);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void saveGradeParalelo(GradeParaleloEntity entity) {
		try{
			repository.save(entity);
		}catch(DataAccessException e){}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteGradeParalelo(GradeParaleloEntity entity) {
		try{
			repository.delete(entity);
		}catch(DataAccessException e){}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public List<GradeParaleloEntity> listGradeParalelo() {
		return repository.findAll();
	}

	
}
