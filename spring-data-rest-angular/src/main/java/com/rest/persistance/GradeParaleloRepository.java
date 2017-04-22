package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.model.GradeParaleloEntity;

@Transactional
public interface GradeParaleloRepository extends JpaRepository<GradeParaleloEntity, Integer>{
	
	GradeParaleloEntity findByGradeParaleloId(int id);
	
}
