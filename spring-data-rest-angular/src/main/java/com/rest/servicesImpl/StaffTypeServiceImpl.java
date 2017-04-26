package com.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rest.model.StaffTypeEntity;
import com.rest.persistance.StaffTypeRepository;
import com.rest.services.StaffTypeService;

@Service
public class StaffTypeServiceImpl implements StaffTypeService {

	@Autowired
	private StaffTypeRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public StaffTypeEntity getStaffTypeById(int id) {
		return repository.findByStaffTypeId(id);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void saveStaffType(StaffTypeEntity entity) {
		try {
			repository.save(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteStaffType(StaffTypeEntity entity) {
		try {
			repository.delete(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	public List<StaffTypeEntity> listStaffType() {
		return repository.findAll();
	}
}
