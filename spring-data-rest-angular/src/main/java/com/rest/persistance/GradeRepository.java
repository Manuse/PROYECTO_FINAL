package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.model.GradeEntity;

@Transactional
public interface GradeRepository extends JpaRepository<GradeEntity, Integer>{

	GradeEntity findByGradeId(int id);
	
}
