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

import com.rest.model.StudentEntity;
import com.rest.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/student/{id}")
	public StudentEntity getStaffTypeById(@RequestParam("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/student/list")
	public List<StudentEntity> getAllStaffType(){
		return studentService.listStudent();
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public void postStaffType(@Valid @RequestBody StudentEntity entity){
		studentService.saveStudent(entity);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public void putStaffType(@Valid @RequestBody StudentEntity entity) {
		
		StudentEntity dto = studentService.getStudentById((entity.getStudentId()));
		dto.setStudentName(entity.getStudentName());
		dto.setlastNameParent1(entity.getlastNameParent1());
		dto.setlastNameParent2(entity.getlastNameParent2());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setPlaceOfBirth(entity.getPlaceOfBirth());
		dto.setSex(entity.getSex());
		dto.setTelephone(entity.getTelephone());
		dto.setMobilePhone(entity.getMobilePhone());
		dto.setAddress(entity.getAddress());
		dto.setParent1Name(entity.getParent1Name());
		dto.setParent2Name(entity.getParent2Name());
		dto.setParent1MobilePhone(entity.getParent1MobilePhone());
		dto.setParent2MobilePhone(entity.getParent2MobilePhone());
		dto.setParent1Profession(entity.getParent1Profession());
		dto.setParent2Profession(entity.getparent2Profession());
		dto.setObservation(entity.getObservation());
		
		//TODO set of the list of ScoredRecords
		studentService.saveStudent(dto);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.DELETE)
	public void deleteStaffType(@Valid @RequestBody StudentEntity entity){
		studentService.deleteStudent(entity);
	}
	
}
