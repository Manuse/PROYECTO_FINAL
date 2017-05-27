package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "GradeParalelo" )
public class GradeParaleloEntity {

	@Id
	@Column( name = "gradeParaleloId" )
	@Digits( integer = 3 , fraction = 0 )
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gradeParaleloId;

	@ManyToOne
	@JoinColumn(name = "grade")
	@JsonIgnore
	private GradeEntity grade;

	@ManyToOne
	@JoinColumn(name = "staff")
	@JsonIgnore
	private StaffEntity staff;
	
	@Column( name = "name" )
	@Length( min = 5 , max = 50 )
	private String name;

	public int getGradeParaleloId() {
		return gradeParaleloId;
	}

	public void setGradeParaleloId(int gradeParaleloId) {
		this.gradeParaleloId = gradeParaleloId;
	}

	public GradeEntity getGrade() {
		return grade;
	}

	public void setGrade(GradeEntity grade) {
		this.grade = grade;
	}

	public StaffEntity getStaff() {
		return staff;
	}

	public void setStaff(StaffEntity staff) {
		this.staff = staff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

