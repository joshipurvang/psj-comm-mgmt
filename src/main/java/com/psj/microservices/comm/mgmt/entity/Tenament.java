package com.psj.microservices.comm.mgmt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Tenament {
	
	@Id
	@GeneratedValue
	private Long tenamentId;
	@ManyToOne
    @JoinColumn(name ="login_Id")
	@JsonIgnore
	private Login loginId;
	private String division;
	private String number;
	@OneToMany(mappedBy = "tenament")
	@JsonIgnoreProperties("tenament")
	private List<User> user =new ArrayList();
	@OneToMany(mappedBy = "tenament")
	@JsonIgnoreProperties("tenament")
	private List<Vehicle> vehicles =new ArrayList();
	
	private Date createdDate;	
	private long createBy;	
	private Date updateDate;
	private long updateBy;
	
	public Long getTenamentId() {
		return tenamentId;
	}
	public void setTenamentId(Long tenamentId) {
		this.tenamentId = tenamentId;
	}
	public Login getLoginId() {
		return loginId;
	}
	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public long getCreateBy() {
		return createBy;
	}
	public void setCreateBy(long createBy) {
		this.createBy = createBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public long getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(long updateBy) {
		this.updateBy = updateBy;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
