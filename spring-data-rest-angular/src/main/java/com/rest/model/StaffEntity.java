package com.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "Staff" )
public class StaffEntity {
	
	@Id
	@Column(name = "staffId")
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staffId;
	
	@Column(name = "name")
	//@NotEmpty
	private String name;
	
	@Column(name = "lastName")
	//@NotEmpty
	private String lastName;
	
	@Column(name = "email")
	//@NotEmpty
	private String email;
	
	@Column(name = "pass")
	//@NotEmpty
	private String pass;

	@Column( name = "dateOfBirth" )
	@Temporal( TemporalType.DATE )
	@DateTimeFormat( pattern = "yyyy/MM/dd" )
	//@NotEmpty
	private Date dateOfBirth;

	@Column( name = "placeOfBirth" )
	//@Length( min = 0 , max = 50 )
	//@NotEmpty
	private String placeOfBirth;

	@Column( name = "sex" )
	//@NotEmpty
	private String sex;

	@Column( name = "mobilePhone" )
	//@Digits( integer = 9 , fraction = 0 )
	//@NotEmpty
	private int mobilePhone;

	@Column( name = "city" )
	//@Length( min = 1 , max = 250)
	//@NotEmpty
	private String city;
	
	@Column( name = "province" )
	//@Length( min = 1 , max = 250)
	//@NotEmpty
	private String province;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "staffTypeId")
	private StaffTypeEntity staffTypeId;
	
	@OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
	private List<GradeParaleloEntity> gradeParalelo;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
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

	public StaffTypeEntity getStaffTypeId() {
		return staffTypeId;
	}

	public void setStaffTypeId(StaffTypeEntity staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

	public List<GradeParaleloEntity> getGradeParalelo() {
		return gradeParalelo;
	}

	public void setGradeParalelo(List<GradeParaleloEntity> gradeParalelo) {
		this.gradeParalelo = gradeParalelo;
	}

	


}
