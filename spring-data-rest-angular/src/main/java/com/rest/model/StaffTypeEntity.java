package com.rest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "StaffType" )
public class StaffTypeEntity {

	@Id
	private int staffTypeId;
	
	@Column( name = "name" )
	@Length( min = 1, max = 25 )
	@NotEmpty
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
    
	@JsonIgnore
	@OneToMany(mappedBy = "staffTypeId", cascade = CascadeType.ALL)
	private List<StaffEntity> staff;

	public List<StaffEntity> getStaff() {
		return staff;
	}

	public void setStaff(List<StaffEntity> staff) {
		this.staff = staff;
	}

	public int getStaffTypeId() {
		return staffTypeId;
	}
	
	public void setStaffTypeId(int staffTypaId) {
		this.staffTypeId = staffTypaId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

