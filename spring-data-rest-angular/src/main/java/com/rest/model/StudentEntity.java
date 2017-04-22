package com.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Student")
public class StudentEntity {

	@Id
	@Digits(integer = 3, fraction = 0)
	@NotEmpty
	private int studentId;

	@Column(name = "studentName")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String studentName;

	@Column(name = "lastNameFather")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String lastNameFather;

	@Column(name = "lastNameMother")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String lastNameMother;

	@Column(name = "dateOfBirth")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@NotEmpty
	private Date dateOfBirth;

	@Column(name = "placeOfBirth")
	@Length(min = 0, max = 50)
	@NotEmpty
	private String placeOfBirth;

	@Column(name = "sex")
	@NotEmpty
	private String sex;

	@Column(name = "telephone")
	@Digits(integer = 9, fraction = 0)
	@NotEmpty
	private int telephone;

	@Column(name = "mobilePhone")
	@Digits(integer = 9, fraction = 0)
	@NotEmpty
	private int mobilePhone;

	@Column(name = "address")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String address;

	@Column(name = "fatherName")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String fatherName;

	@Column(name = "motherName")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String motherName;

	@Column(name = "fatherMobilePhone")
	@Digits(integer = 9, fraction = 0)
	@NotEmpty
	private int fatherMobilePhone;

	@Column(name = "motherMobilePhone")
	@Digits(integer = 9, fraction = 0)
	@NotEmpty
	private int motherMobilePhone;

	@Column(name = "fatherProfession")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String fatherProfession;

	@Column(name = "motherProfession")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String motherProfession;

	@Column(name = "observation")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String observation;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<ScoredRecordEntity> scoredRecord;
	

	public List<ScoredRecordEntity> getScoredRecord() {
		return scoredRecord;
	}

	public void setScoredRecord(List<ScoredRecordEntity> scoredRecord) {
		this.scoredRecord = scoredRecord;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLastNameFather() {
		return lastNameFather;
	}

	public void setLastNameFather(String lastNameFather) {
		this.lastNameFather = lastNameFather;
	}

	public String getLastNameMother() {
		return lastNameMother;
	}

	public void setLastNameMother(String lastNameMother) {
		this.lastNameMother = lastNameMother;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getFatherMobilePhone() {
		return fatherMobilePhone;
	}

	public void setFatherMobilePhone(int fatherMobilePhone) {
		this.fatherMobilePhone = fatherMobilePhone;
	}

	public int getMotherMobilePhone() {
		return motherMobilePhone;
	}

	public void setMotherMobilePhone(int motherMobilePhone) {
		this.motherMobilePhone = motherMobilePhone;
	}

	public String getFatherProfession() {
		return fatherProfession;
	}

	public void setFatherProfession(String fatherProfession) {
		this.fatherProfession = fatherProfession;
	}

	public String getMotherProfession() {
		return motherProfession;
	}

	public void setMotherProfession(String motherProfession) {
		this.motherProfession = motherProfession;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

}
