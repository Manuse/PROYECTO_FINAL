package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.StaffTypeEntity;
import com.rest.services.StaffTypeService;

@Controller
public class StaffTypeController extends AbstractResourceController{

	@Autowired
	private StaffTypeService staffTypeService;

	@GetMapping(value = "/staffType")
	@ResponseBody
	public StaffTypeEntity getStaffTypeById(@RequestParam("id") int id) {
		return staffTypeService.getStaffTypeById(id);
	}
	
	@GetMapping("/staffType/list")
	@ResponseBody
	public List<StaffTypeEntity> getAllStaffType(){
		return staffTypeService.listStaffType();
	}
	
	@RequestMapping(value = "/staffType", method = RequestMethod.POST)
	@ResponseBody
	public void postStaffType(@RequestBody StaffTypeEntity entity){
		staffTypeService.saveStaffType(entity);
	}
	
	@RequestMapping(value = "/staffType", method = RequestMethod.PUT)
	@ResponseBody
	public void putStaffType(@RequestBody StaffTypeEntity entity) {
		
		StaffTypeEntity dto = staffTypeService.getStaffTypeById((entity.getStaffTypeId()));
		dto.setName(entity.getName());
		//TODO set of the list of Staff
		staffTypeService.saveStaffType(dto);
	}
	
	@RequestMapping(value = "/staffType", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteStaffType(@RequestBody StaffTypeEntity entity){
		staffTypeService.deleteStaffType(entity);
	}
}
