package com.rest.persistance;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.model.StaffEntity;

@Transactional
public interface StaffRepository extends JpaRepository<StaffEntity, Integer>{

	StaffEntity findByStaffId(int id);
	
	StaffEntity findByEmail(String email);
	
}
