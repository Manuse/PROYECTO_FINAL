package com.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.model.StaffEntity;
import com.rest.services.StaffService;


@Controller
public class StaffController {
	
	@Autowired
	private StaffService staffService;

	@GetMapping(value = "/staff/{id}")
	public StaffEntity getStaffById(@RequestParam("id") int id) {
		return staffService.getStaffById(id);
	}
	
	@GetMapping("/staff/list")
	public List<StaffEntity> getAllStaff(){
		return staffService.listStaff();
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.POST)
	public void postStaff(@Valid @RequestBody StaffEntity entity){
		staffService.saveStaff(entity);
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.PUT)
	public void putStaffType(@Valid @RequestBody StaffEntity entity) {
		
		StaffEntity dto = staffService.getStaffById((entity.getStaffId()));
		dto.setLastNameParent1(entity.getLastNameParent1());
		dto.setLastNameParent2(entity.getLastNameParent2());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setPlaceOfBirth(entity.getPlaceOfBirth());
		dto.setSex(entity.getSex());
		dto.setTelephone(entity.getTelephone());
		dto.setMobilePhone(entity.getMobilePhone());
		dto.setAddress(entity.getAddress());
		dto.setDateOfHiring(entity.getDateOfHiring());
		dto.setFormation(entity.getFormation());
		dto.setSpecialty(entity.getSpecialty());
		dto.setCategory(entity.getCategory());
		dto.setSalary(entity.getSalary());
		dto.setStaffTypeId(entity.getStaffTypeId());
		//TODO set of the list of gradeParalelo
		staffService.saveStaff(dto);
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.DELETE)
	public void deleteStaffType(@Valid @RequestBody StaffEntity entity){
		staffService.deleteStaff(entity);
	}
}
