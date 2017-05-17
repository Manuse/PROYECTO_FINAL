package com.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Student")
public class StudentEntity {

	@Id
	@Digits(integer = 3, fraction = 0)
	@NotEmpty
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;

	@Column(name = "email")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String email;
	
	@Column(name = "pass")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String pass;
	
	@Column(name = "studentName")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String studentName;

	@Column(name = "lastNameParent1")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String lastNameParent1;

	@Column(name = "lastNameParent2")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String lastNameParent2;

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

	@Column(name = "parent1Name")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String parent1Name;

	@Column(name = "parent2Name")
	@Length(min = 3, max = 50)
	@NotEmpty
	private String parent2Name;

	@Column(name = "parent1MobilePhone")
	@Digits(integer = 9, fraction = 0)
	@NotEmpty
	private int parent1MobilePhone;

	@Column(name = "parent2MobilePhone")
	@Digits(integer = 9, fraction = 0)
	@NotEmpty
	private int parent2MobilePhone;

	@Column(name = "parent1Profession")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String parent1Profession;

	@Column(name = "parent2Profession")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String parent2Profession;

	@Column(name = "observation")
	@Length(min = 1, max = 250)
	@NotEmpty
	private String observation;
	
	@OneToMany(mappedBy = "student" ,cascade = CascadeType.ALL)
	private List<ScoredRecordEntity> scoredRecord;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLastNameParent1() {
		return lastNameParent1;
	}

	public void setLastNameParent1(String lastNameParent1) {
		this.lastNameParent1 = lastNameParent1;
	}

	public String getLastNameParent2() {
		return lastNameParent2;
	}

	public void setLastNameParent2(String lastNameParent2) {
		this.lastNameParent2 = lastNameParent2;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
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

	public String getParent1Name() {
		return parent1Name;
	}

	public void setParent1Name(String parent1Name) {
		this.parent1Name = parent1Name;
	}

	public String getParent2Name() {
		return parent2Name;
	}

	public void setParent2Name(String parent2Name) {
		this.parent2Name = parent2Name;
	}

	public int getParent1MobilePhone() {
		return parent1MobilePhone;
	}

	public void setParent1MobilePhone(int parent1MobilePhone) {
		this.parent1MobilePhone = parent1MobilePhone;
	}

	public int getParent2MobilePhone() {
		return parent2MobilePhone;
	}

	public void setParent2MobilePhone(int parent2MobilePhone) {
		this.parent2MobilePhone = parent2MobilePhone;
	}

	public String getParent1Profession() {
		return parent1Profession;
	}

	public void setParent1Profession(String parent1Profession) {
		this.parent1Profession = parent1Profession;
	}

	public String getParent2Profession() {
		return parent2Profession;
	}

	public void setParent2Profession(String parent2Profession) {
		this.parent2Profession = parent2Profession;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public List<ScoredRecordEntity> getScoredRecord() {
		return scoredRecord;
	}

	public void setScoredRecord(List<ScoredRecordEntity> scoredRecord) {
		this.scoredRecord = scoredRecord;
	}
	

	
}
