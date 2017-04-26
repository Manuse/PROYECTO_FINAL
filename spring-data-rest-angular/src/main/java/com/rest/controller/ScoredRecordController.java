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

import com.rest.model.ScoredRecordEntity;
import com.rest.services.ScoredRecordService;

@Controller
public class ScoredRecordController {
	
	@Autowired
	private ScoredRecordService scoredRecordService;

	@GetMapping(value = "/scoredRecord/{id}")
	public ScoredRecordEntity getScoredRecordById(@RequestParam("id") int id) {
		return scoredRecordService.getScoredRecordById(id);
	}
	
	@GetMapping("/scoredRecord/list")
	public List<ScoredRecordEntity> getAllScoredRecord(){
		return scoredRecordService.listScoredRecord();
	}
	
	@RequestMapping(value = "/scoredRecord", method = RequestMethod.POST)
	public void postScoredRecord(@Valid @RequestBody ScoredRecordEntity entity){
		scoredRecordService.saveScoredRecord(entity);
	}
	
	@RequestMapping(value = "/scoredRecord", method = RequestMethod.PUT)
	public void putScoredRecord(@Valid @RequestBody ScoredRecordEntity entity) {
		
		ScoredRecordEntity dto = scoredRecordService.getScoredRecordById(entity.getScoredRecordId());
		dto.setFirstTrimester(entity.getFirstTrimester());
		dto.setSecondTrimester(entity.getSecondTrimester());
		dto.setThirdTrimester(entity.getThirdTrimester());
		dto.setYear(entity.getYear());
		dto.setSubject(entity.getSubject());
		scoredRecordService.saveScoredRecord(entity);
	}
	
	@RequestMapping(value = "/scoredRecord", method = RequestMethod.DELETE)
	public void deleteScoredRecord(@Valid @RequestBody ScoredRecordEntity entity){
		scoredRecordService.deleteScoredRecord(entity);
	}
}
