package com.rest.services;

import java.util.List;

import com.rest.model.ScoredRecordEntity;

public interface ScoredRecordService {
	
	ScoredRecordEntity getScoredRecordById(int id);
	
	void saveScoredRecord(ScoredRecordEntity entity);
	
	void deleteScoredRecord(ScoredRecordEntity entity);
	
	List<ScoredRecordEntity> getScoredRecordByStudentId(int id);
	
	List<ScoredRecordEntity> listScoredRecord();
}
