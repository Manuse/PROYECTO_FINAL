package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.model.StudentEntity;

@Transactional
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	
	StudentEntity findByStudentId(int id);
	
	StudentEntity findByEmail(String email);
	
	@Query("select a from StudentEntity a where email = ? and pass = ?")
	StudentEntity login(String email, String pass);
}
