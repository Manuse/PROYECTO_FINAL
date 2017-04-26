package com.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rest.model.StaffEntity;
import com.rest.persistance.StaffRepository;
import com.rest.services.StaffService;

@Service
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	private StaffRepository repository;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public StaffEntity getStaffById(int id) {
		return repository.findByStaffId(id);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void saveStaff(StaffEntity entity) {
		try {
			repository.save(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteStaff(StaffEntity entity) {
		try {
			repository.delete(entity);
		} catch (DataAccessException e) {}
	}

	@Override
	public List<StaffEntity> listStaff() {
		return repository.findAll();
	}
}
