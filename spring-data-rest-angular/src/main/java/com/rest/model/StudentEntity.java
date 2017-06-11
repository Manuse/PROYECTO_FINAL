package com.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import ch.qos.logback.classic.ViewStatusMessagesServlet;

@Entity
@Table(name = "Student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;

	@Column(name = "email")
	//@Length(min = 3, max = 50)
	//@NotEmpty
	private String email;
	
	@Column(name = "pass")
	//@Length(min = 3, max = 50)
	//@NotEmpty
	private String pass;
	
	@Column(name = "name")
	//@Length(min = 3, max = 50)
	//@NotEmpty
	private String name;
	
	@Column(name = "lastName")
	//@Length(min = 3, max = 50)
	//@NotEmpty
	private String lastName;

	@Column(name = "guardianName")
	//@Length(min = 3, max = 50)
	//@NotEmpty
	private String guardianName;

	@Column(name = "guardianLastName")
	//@Length(min = 3, max = 50)
	//@NotEmpty
	private String guardianLastName;

	@Column(name = "dateOfBirth")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@NotEmpty
	private Date dateOfBirth;

	@Column(name = "placeOfBirth")
	//@Length(min = 0, max = 50)
	//@NotEmpty
	private String placeOfBirth;

	@Column(name = "sex")
	//@NotEmpty
	private String sex;

	@Column(name = "mobilePhone")
	//@Digits(integer = 9, fraction = 0)
	//@NotEmpty
	private int mobilePhone;

	@Column(name = "city")
	//@Length(min = 1, max = 250)
	//@NotEmpty
	private String city;
	
	@Column(name = "province")
	//@Length(min = 1, max = 250)
	//@NotEmpty
	private String province;

	@Column(name = "guardianMobilePhone")
	//@Digits(integer = 9, fraction = 0)
	//@NotEmpty
	private int guardianMobilePhone;

	@Column(name = "observation")
	//@Length(min = 1, max = 250)
	//@NotEmpty
	private String observation;
	
	@JsonIgnore
	@OneToMany(mappedBy = "student" ,cascade = CascadeType.ALL/*, fetch = FetchType.LAZY*/)
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianLastName() {
		return guardianLastName;
	}

	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
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

	public int getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getGuardianMobilePhone() {
		return guardianMobilePhone;
	}

	public void setGuardianMobilePhone(int guardianMobilePhone) {
		this.guardianMobilePhone = guardianMobilePhone;
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
