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

import com.rest.model.SubjectEntity;
import com.rest.services.SubjectService;


@Controller
public class SubjectController extends AbstractResourceController{
	
	@Autowired
	private SubjectService subjectService;

	@GetMapping(value = "/subject")
	@ResponseBody
	public SubjectEntity getSubjectById(@RequestParam("id") int id) {
		return subjectService.getSubjectById(id);
	}
	
	@GetMapping(value = "/subject/code")
	@ResponseBody
	public SubjectEntity getSubjectByCode(@RequestParam("code") String code) {
		return subjectService.getSubjectByCode(code);
	}
	
	@GetMapping("/subject/list")
	@ResponseBody
	public List<SubjectEntity> getAllSubject(){
		return subjectService.listSubject();
	}
	
	@RequestMapping(value = "/subject", method = RequestMethod.POST)
	@ResponseBody
	public void postSubject(@RequestBody SubjectEntity entity){
		subjectService.saveSubject(entity);
	}
	
	@RequestMapping(value = "/subject", method = RequestMethod.PUT)
	@ResponseBody
	public void putSubject(@RequestBody SubjectEntity entity) {
		
		SubjectEntity dto = subjectService.getSubjectById((entity.getSubjectId()));
		dto.setSubjectName(entity.getSubjectName());
		dto.setAbbreviation(entity.getAbbreviation());
		//TODO set of the list of Records and Grades
		subjectService.saveSubject(dto);
	}
	
	@RequestMapping(value = "/subject", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteSubject(@RequestBody SubjectEntity entity){
		subjectService.deleteSubject(entity);
	}
}
