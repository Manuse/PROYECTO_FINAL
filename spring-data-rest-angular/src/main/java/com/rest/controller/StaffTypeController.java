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

import com.rest.model.StaffTypeEntity;
import com.rest.services.StaffTypeService;

@Controller
public class StaffTypeController {

	@Autowired
	private StaffTypeService staffTypeService;

	@GetMapping(value = "/staffType/{id}")
	public StaffTypeEntity getStaffTypeById(@RequestParam("id") int id) {
		return staffTypeService.getStaffTypeById(id);
	}
	
	@GetMapping("/staffType/list")
	public List<StaffTypeEntity> getAllStaffType(){
		return staffTypeService.listStaffType();
	}
	
	@RequestMapping(value = "/staffType", method = RequestMethod.POST)
	public void postStaffType(@Valid @RequestBody StaffTypeEntity entity){
		staffTypeService.saveStaffType(entity);
	}
	
	@RequestMapping(value = "/staffType", method = RequestMethod.PUT)
	public void putStaffType(@Valid @RequestBody StaffTypeEntity entity) {
		
		StaffTypeEntity dto = staffTypeService.getStaffTypeById((entity.getStaffTypeId()));
		dto.setName(entity.getName());
		//TODO set of the list of Staff
		staffTypeService.saveStaffType(dto);
	}
	
	@RequestMapping(value = "/staffType", method = RequestMethod.DELETE)
	public void deleteStaffType(@Valid @RequestBody StaffTypeEntity entity){
		staffTypeService.deleteStaffType(entity);
	}
}
