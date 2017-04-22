package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.model.SubjectEntity;

@Transactional
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {

	SubjectEntity findBySubjectId(int id);
	
}
