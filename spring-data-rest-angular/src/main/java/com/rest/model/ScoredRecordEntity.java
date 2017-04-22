package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ScoredRecord")
public class ScoredRecordEntity {

	@Id
	@Column(name = "scoredRecordId")
	@Digits(integer = 3, fraction = 0)
	@NotEmpty
	private int scoredRecordId;

	@ManyToOne
	@JoinColumn(name = "subject")
	private SubjectEntity subject;

	@ManyToOne
	@JoinColumn(name = "student")
	private StudentEntity student;

	@Column(name = "firstTrimester")
	@Digits(integer = 2, fraction = 0)
	@NotEmpty
	private int firstTrimester;

	@Column(name = "secondTrimester")
	@Digits(integer = 2, fraction = 0)
	@NotEmpty
	private int secondTrimester;

	@Column(name = "thirdTrimester")
	@Digits(integer = 2, fraction = 0)
	@NotEmpty
	private int thirdTrimester;

	@Column(name = "year")
	@Digits(integer = 2, fraction = 0)
	@NotEmpty
	private int year;

	public int getScoredRecordId() {
		return this.scoredRecordId;
	}

	public void setScoredRecordId(int scoredRecordId) {
		this.scoredRecordId = scoredRecordId;
	}

	public SubjectEntity getSubject() {
		return subject;
	}

	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public int getFirstTrimester() {
		return firstTrimester;
	}

	public void setFirstTrimester(int firstTrimester) {
		this.firstTrimester = firstTrimester;
	}

	public int getSecondTrimester() {
		return secondTrimester;
	}

	public void setSecondTrimester(int secondTrimester) {
		this.secondTrimester = secondTrimester;
	}

	public int getThirdTrimester() {
		return thirdTrimester;
	}

	public void setThirdTrimester(int thirdTrimester) {
		this.thirdTrimester = thirdTrimester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
