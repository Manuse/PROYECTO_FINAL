package com.rest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.StaffTypeEntity;
import com.rest.persistance.StaffTypeRepository;
import com.rest.services.StaffTypeService;

@Service
public class StaffTypeServiceImpl implements StaffTypeService {

	@Autowired
	private StaffTypeRepository repository;

	@Override
	public StaffTypeEntity getStaffTypeById(int id) {
		return repository.findByStaffTypeId(id);
	}
}
