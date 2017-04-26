package com.rest.services;

import java.util.List;

import com.rest.model.SubjectEntity;

public interface SubjectService {

	SubjectEntity getSubjectById(int id);
	
	void saveSubject(SubjectEntity entity);
	
	void deleteSubject(SubjectEntity entity);
	
	List<SubjectEntity> listSubject();
}
