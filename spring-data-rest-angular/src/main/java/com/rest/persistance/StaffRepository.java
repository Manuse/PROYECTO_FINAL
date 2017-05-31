package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.model.StaffEntity;

@Transactional
public interface StaffRepository extends JpaRepository<StaffEntity, Integer>{

	StaffEntity findByStaffId(int id);
	
	StaffEntity findByEmail(String email);
	
	@Query("select a from StaffEntity a where email = ? and pass = ?")
	StaffEntity login(String email, String pass);
}
