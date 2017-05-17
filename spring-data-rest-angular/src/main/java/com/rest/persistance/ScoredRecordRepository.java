package com.rest.persistance;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.ScoredRecordEntity;


@Transactional
public interface ScoredRecordRepository extends JpaRepository<ScoredRecordEntity, Integer>{

	ScoredRecordEntity findByScoredRecordId(int id);
	
}
