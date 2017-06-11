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

import com.rest.model.GradeParaleloEntity;
import com.rest.services.GradeParaleloService;

@Controller
public class GradeParaleloController extends AbstractResourceController{

	@Autowired
	private GradeParaleloService gradeParaleloService;
	
	@GetMapping(value = "/gradeParalelo")
	@ResponseBody
	public GradeParaleloEntity getGradeParaleloById(@RequestParam("id") int id) {
		return gradeParaleloService.getGradeParaleloById(id);
	}
	
	@GetMapping("/gradeParalelo/list")
	@ResponseBody
	public List<GradeParaleloEntity> getAllGradeParalelo(){
		return gradeParaleloService.listGradeParalelo();
	}
	
	@RequestMapping(value = "/gradeParalelo", method = RequestMethod.POST)
	@ResponseBody
	public void postGradeParalelo(@RequestBody GradeParaleloEntity entity){
		gradeParaleloService.saveGradeParalelo(entity);
	}
	
	@RequestMapping(value = "/gradeParalelo", method = RequestMethod.PUT)
	@ResponseBody
	public void putGradeParalelo(@RequestBody GradeParaleloEntity entity) {
		
		GradeParaleloEntity dto = gradeParaleloService.getGradeParaleloById(entity.getGradeParaleloId());
		dto.setGrade(entity.getGrade());
		dto.setName(entity.getName());
		dto.setStaff(entity.getStaff());
		gradeParaleloService.saveGradeParalelo(dto);
	}
	
	@RequestMapping(value = "/gradeParalelo", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGradeParalelo(@RequestBody GradeParaleloEntity entity){
		gradeParaleloService.deleteGradeParalelo(entity);
	}
  
}
