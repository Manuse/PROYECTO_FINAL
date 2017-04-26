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

import com.rest.model.GradeParaleloEntity;
import com.rest.services.GradeParaleloService;

@Controller
public class GradeParaleloController {

	@Autowired
	private GradeParaleloService gradeParaleloService;
	
	@RequestMapping(value = "/gradeParalelo/{id}", method = RequestMethod.GET)
	public GradeParaleloEntity getGradeParaleloById(@RequestParam("id") int id) {
		return gradeParaleloService.getGradeParaleloById(id);
	}
	
	@GetMapping("/gradeParalelo/list")
	public List<GradeParaleloEntity> getAllGradeParalelo(){
		return gradeParaleloService.listGradeParalelo();
	}
	
	@RequestMapping(value = "/gradeParalelo", method = RequestMethod.POST)
	public void postGradeParalelo(@Valid @RequestBody GradeParaleloEntity entity){
		gradeParaleloService.saveGradeParalelo(entity);
	}
	
	@RequestMapping(value = "/gradeParalelo", method = RequestMethod.PUT)
	public void putGradeParalelo(@Valid @RequestBody GradeParaleloEntity entity) {
		
		GradeParaleloEntity dto = gradeParaleloService.getGradeParaleloById(entity.getGradeParaleloId());
		dto.setGrade(entity.getGrade());
		dto.setName(entity.getName());
		dto.setStaff(entity.getStaff());
		gradeParaleloService.saveGradeParalelo(dto);
	}
	
	@RequestMapping(value = "/gradeParalelo", method = RequestMethod.DELETE)
	public void deleteGradeParalelo(@Valid @RequestBody GradeParaleloEntity entity){
		gradeParaleloService.deleteGradeParalelo(entity);
	}
  
}
