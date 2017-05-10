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

import com.rest.model.ScoredRecordEntity;
import com.rest.services.ScoredRecordService;

@Controller
public class ScoredRecordController {
	
	@Autowired
	private ScoredRecordService scoredRecordService;

	@GetMapping(value = "/scoredRecord")
	@ResponseBody
	public ScoredRecordEntity getScoredRecordById(@RequestParam("id") int id) {
		return scoredRecordService.getScoredRecordById(id);
	}
	
	@GetMapping("/scoredRecord/list")
	@ResponseBody
	public List<ScoredRecordEntity> getAllScoredRecord(){
		return scoredRecordService.listScoredRecord();
	}
	
	@RequestMapping(value = "/scoredRecord", method = RequestMethod.POST)
	@ResponseBody
	public void postScoredRecord(@RequestBody ScoredRecordEntity entity){
		scoredRecordService.saveScoredRecord(entity);
	}
	
	@RequestMapping(value = "/scoredRecord", method = RequestMethod.PUT)
	@ResponseBody
	public void putScoredRecord(@RequestBody ScoredRecordEntity entity) {
		
		ScoredRecordEntity dto = scoredRecordService.getScoredRecordById(entity.getScoredRecordId());
		dto.setFirstTrimester(entity.getFirstTrimester());
		dto.setSecondTrimester(entity.getSecondTrimester());
		dto.setThirdTrimester(entity.getThirdTrimester());
		dto.setYear(entity.getYear());
		dto.setSubject(entity.getSubject());
		scoredRecordService.saveScoredRecord(entity);
	}
	
	@RequestMapping(value = "/scoredRecord", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteScoredRecord(@RequestBody ScoredRecordEntity entity){
		scoredRecordService.deleteScoredRecord(entity);
	}
}
