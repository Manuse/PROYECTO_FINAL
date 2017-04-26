package com.rest.services;

import java.util.List;

import com.rest.model.GradeParaleloEntity;

public interface GradeParaleloService {

	GradeParaleloEntity getGradeParaleloById(int id);
	
	void saveGradeParalelo(GradeParaleloEntity entity);
	
	void deleteGradeParalelo(GradeParaleloEntity entity);
	
	List<GradeParaleloEntity> listGradeParalelo();
	
}
