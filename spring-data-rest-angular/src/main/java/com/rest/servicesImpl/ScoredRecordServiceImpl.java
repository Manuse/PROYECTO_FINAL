package com.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.rest.model.ScoredRecordEntity;
import com.rest.persistance.ScoredRecordRepository;
import com.rest.services.ScoredRecordService;

@Service
public class ScoredRecordServiceImpl implements ScoredRecordService{

	@Autowired
	private ScoredRecordRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	
	
	public ScoredRecordEntity getScoredRecordById(int id) {
		return repository.findByScoredRecordId(id);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void saveScoredRecord(ScoredRecordEntity entity) {
		try {
			repository.save(entity);
		} catch (DataAccessException e){}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteScoredRecord(ScoredRecordEntity entity) {
		try {
			repository.delete(entity);
		} catch (DataAccessException e){}
	}

	@Override
	
	public List<ScoredRecordEntity> listScoredRecord() {
		return repository.findAll();
	}
	
}
