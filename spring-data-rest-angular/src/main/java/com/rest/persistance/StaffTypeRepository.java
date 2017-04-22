package com.rest.persistance;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.StaffTypeEntity;

@Transactional
public interface StaffTypeRepository extends JpaRepository<StaffTypeEntity, Integer> {

	StaffTypeEntity findByStaffTypeId(int id);
	
}
