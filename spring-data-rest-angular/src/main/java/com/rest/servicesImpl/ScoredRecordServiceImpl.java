package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.ScoredRecordEntity;
import com.rest.persistance.ScoredRecordRepository;
import com.rest.services.ScoredRecordService;

@Service
public class ScoredRecordServiceImpl implements ScoredRecordService{

	@Autowired
	private ScoredRecordRepository repository;

	@Override
	public ScoredRecordEntity getScoredRecordById(int id) {
		return repository.findByScoredRecordId(id);
	}
	
}
