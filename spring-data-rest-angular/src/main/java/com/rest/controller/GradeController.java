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

import com.rest.model.GradeEntity;
import com.rest.services.GradeService;

@Controller
public class GradeController extends AbstractResourceController{
	
	@Autowired
	private GradeService gradeService;

	@GetMapping(value = "/grade")
	@ResponseBody
	public GradeEntity getGradeById(@RequestParam("id") int id) {
		return gradeService.getGradeById(id);
	}
	
	@GetMapping("/grade/list")
	@ResponseBody
	public List<GradeEntity> getAllGrade(){
		return gradeService.listGrade();
	}
	
	@RequestMapping(value = "/grade", method = RequestMethod.POST)
	@ResponseBody
	public void postGrade(@RequestBody GradeEntity entity){
		gradeService.saveGrade(entity);
	}
	
	@RequestMapping(value = "/grade", method = RequestMethod.PUT)
	@ResponseBody
	public void putGrade(@RequestBody GradeEntity entity) {
		
		GradeEntity dto = gradeService.getGradeById(entity.getGradeId());
		dto.setName(entity.getName());
		dto.setObservation(entity.getObservation());
		gradeService.saveGrade(dto);
	}
	
	@RequestMapping(value = "/grade", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGrade(@RequestBody GradeEntity entity){
		gradeService.deleteGrade(entity);
	}
}
