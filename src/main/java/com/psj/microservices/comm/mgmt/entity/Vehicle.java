package com.psj.microservices.comm.mgmt.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private Long vehicleId;
	@ManyToOne
	@JoinColumn(name = "tenament_Id")
	@JsonIgnoreProperties("vehicles")
	private Tenament tenament;
	private String vehicleType;
	private String vehicleNumber;
	private String vehicleBrand;
	private String vehicleOwnership;
	private Date createdDate;	
	private long createBy;	
	private Date updateDate;
	private long updateBy;
	
	public Long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public Tenament getTenament() {
		return tenament;
	}
	public void setTenament(Tenament tenament) {
		this.tenament = tenament;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleOwnership() {
		return vehicleOwnership;
	}
	public void setVehicleOwnership(String vehicleOwnership) {
		this.vehicleOwnership = vehicleOwnership;
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

}
