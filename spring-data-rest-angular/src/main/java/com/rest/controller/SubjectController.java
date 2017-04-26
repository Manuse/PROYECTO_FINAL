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

import com.rest.model.SubjectEntity;
import com.rest.services.SubjectService;


@Controller
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;

	@GetMapping(value = "/subject/{id}")
	public SubjectEntity getSubjectById(@RequestParam("id") int id) {
		return subjectService.getSubjectById(id);
	}
	
	@GetMapping("/subject/list")
	public List<SubjectEntity> getAllSubject(){
		return subjectService.listSubject();
	}
	
	@RequestMapping(value = "/subject", method = RequestMethod.POST)
	public void postSubject(@Valid @RequestBody SubjectEntity entity){
		subjectService.saveSubject(entity);
	}
	
	@RequestMapping(value = "/subject", method = RequestMethod.PUT)
	public void putSubject(@Valid @RequestBody SubjectEntity entity) {
		
		SubjectEntity dto = subjectService.getSubjectById((entity.getSubjectId()));
		dto.setSubjectName(entity.getSubjectName());
		dto.setAbbreviation(entity.getAbbreviation());
		//TODO set of the list of Records and Grades
		subjectService.saveSubject(dto);
	}
	
	@RequestMapping(value = "/subject", method = RequestMethod.DELETE)
	public void deleteSubject(@Valid @RequestBody SubjectEntity entity){
		subjectService.deleteSubject(entity);
	}
}
