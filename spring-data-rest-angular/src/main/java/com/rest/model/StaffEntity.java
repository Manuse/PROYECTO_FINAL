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

@Entity
@Table( name = "Staff" )
public class StaffEntity {
	
	@Id
	@Column(name = "staff")
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staffId;
	
	@Column( name = "lastNameParent1" )
	@Length( min = 0 , max = 50 )
	@NotEmpty
	private String lastNameParent1;
	
	//this one can be empty because of monoparental families
	@Column( name = "lastNameParent2" )
	@Length( min = 0 , max = 50 )
	private String lastNameParent2;

	@Column( name = "dateOfBirth" )
	@Temporal( TemporalType.DATE )
	@DateTimeFormat( pattern = "yyyy/MM/dd" )
	@NotEmpty
	private Date dateOfBirth;

	@Column( name = "placeOfBirth" )
	@Length( min = 0 , max = 50 )
	@NotEmpty
	private String placeOfBirth;

	@Column( name = "sex" )
	@NotEmpty
	private String sex;

	@Column( name = "telephone" )
	@Digits( integer = 9 , fraction = 0 )
	@NotEmpty
	private int telephone;

	@Column( name = "mobilePhone" )
	@Digits( integer = 9 , fraction = 0 )
	@NotEmpty
	private int mobilePhone;

	@Column( name = "address" )
	@Length( min = 1 , max = 250)
	@NotEmpty
	private String address;

	@Column( name = "dateOfHiring" )
	@Temporal( TemporalType.DATE )
	@DateTimeFormat( pattern = "yyyy/MM/dd" )
	@NotEmpty
	private Date dateOfHiring;

	
	@Column( name = "formation" )
	@Length( min = 0 , max = 500 )
	@NotEmpty
	private String formation;
	
	@Column( name = "specialty" )
	@Length( min = 0 , max = 500 )
	@NotEmpty
	private String specialty;
	
	@Column( name = "category" )
	@Length( min = 0 , max = 500 )
	@NotEmpty
	private String category;
	
	@Column( name = "salary" )
	@Digits( integer = 5 , fraction = 2 )
	@NotEmpty
	private double salary;
	
	@ManyToOne
	@JoinColumn(name = "staffTypeId")
	private StaffTypeEntity staffTypeId;
	
	@OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
	private List<GradeParaleloEntity> gradeParalelo;

	
	public List<GradeParaleloEntity> getGradeParalelo() {
		return gradeParalelo;
	}

	public void setGradeParalelo(List<GradeParaleloEntity> gradeParalelo) {
		this.gradeParalelo = gradeParalelo;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
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

	public Date getDateOfHiring() {
		return dateOfHiring;
	}

	public void setDateOfHiring(Date dateOfHiring) {
		this.dateOfHiring = dateOfHiring;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public StaffTypeEntity getStaffTypeId() {
		return staffTypeId;
	}
	
	public void setStaffTypeId(StaffTypeEntity staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

}
