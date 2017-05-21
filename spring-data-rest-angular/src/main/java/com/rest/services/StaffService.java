package com.rest.services;

import java.util.List;

import com.rest.model.StaffEntity;

public interface StaffService {

	StaffEntity getStaffById(int id);
	
	boolean saveStaff(StaffEntity entity);
	
	void deleteStaff(StaffEntity entity);
	
	List<StaffEntity> listStaff();
	
}
