package com.rest.model;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Subjects")
public class SubjectEntity {

	@Id
	@Column(name = "subjectId")
	// @Digits( integer = 3 , fraction = 0 )
	// @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;

	@Column(name = "subjectName")
	// @Length( min = 10 , max = 50 )
	// @NotEmpty
	private String subjectName;

	@Column(name = "abbreviation")
	// @Length( min = 1 , max = 3 )
	private String abbreviation;

	@Column(name = "code")
	private String code = String.valueOf(new BigInteger(130, new SecureRandom()).toString(32)).substring(0, 9);

	@JsonIgnore
	@ManyToMany(mappedBy = "subjects", cascade = CascadeType.ALL)
	private List<GradeEntity> grade;

	@JsonIgnore
	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	private List<ScoredRecordEntity> scoredRecord;

	// default getters and setters

	public int getSubjectId() {
		return subjectId;
	}

	public List<ScoredRecordEntity> getScoredRecord() {
		return scoredRecord;
	}

	public void setScoredRecord(List<ScoredRecordEntity> scoredRecord) {
		this.scoredRecord = scoredRecord;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<GradeEntity> getGrade() {
		return grade;
	}

	public void setGrade(List<GradeEntity> grade) {
		this.grade = grade;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// method to convert code
}
