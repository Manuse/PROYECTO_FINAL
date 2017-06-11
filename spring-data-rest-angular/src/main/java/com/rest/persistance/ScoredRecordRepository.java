package com.rest.persistance;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.model.ScoredRecordEntity;


@Transactional
public interface ScoredRecordRepository extends JpaRepository<ScoredRecordEntity, Integer>{

	ScoredRecordEntity findByScoredRecordId(int id);
	
	@Query("select a from ScoredRecordEntity a where a.student.studentId = ?")
	List<ScoredRecordEntity> findByStudent(int id);
	
	@Query("select a from ScoredRecordEntity a where a.subject.subjectId = ?")
	List<ScoredRecordEntity> findBySubject(int id);
}
