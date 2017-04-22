package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.GradeParaleloEntity;
import com.rest.services.GradeParaleloService;

@Controller
public class GradeParaleloController {

	@Autowired
	private GradeParaleloService gradeParaleloService;
	
	@RequestMapping("/gradeParalelo")
	@ResponseBody
	public GradeParaleloEntity getGradeParaleloById() {
		return gradeParaleloService.getGradeParaleloById(1);
	}
  
}
