package com.rest.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table( name = "Grade" )
public class GradeEntity {

	@Id
	@Column( name = "gradeId" )
	@Digits( integer = 3 , fraction = 0 )
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gradeId;

	@Column( name = "name" )
	@Length( min = 5 , max = 200 )
	@NotEmpty
	private String name;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Grade_Subject", joinColumns = @JoinColumn(name = "gradeId"), inverseJoinColumns = @JoinColumn(name = "subjectId"))
	private Set<SubjectEntity> subjects;

	@Column( name = "observation" )
    @Length( min = 0 , max = 500 )
	@NotEmpty
	private String observation;
	 
	@OneToMany(mappedBy = "grade", cascade = CascadeType.ALL)
	private List<GradeParaleloEntity> gradeParalelo;

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set<SubjectEntity> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<SubjectEntity> subjects) {
		this.subjects = subjects;
	}

	public List<GradeParaleloEntity> getGradeParalelo() {
		return gradeParalelo;
	}

	public void setGradeParalelo(List<GradeParaleloEntity> gradeParalelo) {
		this.gradeParalelo = gradeParalelo;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}

