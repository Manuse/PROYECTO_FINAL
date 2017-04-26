package com.rest.services;

import java.util.List;

import com.rest.model.StaffTypeEntity;

public interface StaffTypeService {

	StaffTypeEntity getStaffTypeById(int id);
	
	void saveStaffType(StaffTypeEntity entity);
	
	void deleteStaffType(StaffTypeEntity entity);
	
	List<StaffTypeEntity> listStaffType();
	
}
