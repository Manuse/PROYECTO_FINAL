package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.model.StudentEntity;

@Transactional
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	
	StudentEntity findByStudentId(int id);
	
}
