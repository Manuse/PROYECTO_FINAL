package com.rest.services;

import java.util.List;

import com.rest.model.GradeEntity;

public interface GradeService {

	GradeEntity getGradeById(int id);
	
	void saveGrade(GradeEntity entity);
	
	void deleteGrade(GradeEntity entity);
	
	List<GradeEntity> listGrade();
	
}
