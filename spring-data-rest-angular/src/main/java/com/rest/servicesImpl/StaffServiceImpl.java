package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.StaffEntity;
import com.rest.persistance.StaffRepository;
import com.rest.services.StaffService;

@Service
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	private StaffRepository repository;

	@Override
	public StaffEntity getStaffById(int id) {
		return repository.findByStaffId(id);
	}
}
