package com.vrs.vrsrest.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {

	@Id
	@Column(name = "vehicleId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vehicleId;

	@Column(name = "plateNo")
	private String plateNo;

	@Column(name = "make")
	private String make;

	@Column(name = "driver")
	private String driver;

	@Column(name = "contactNo")
	private String contactNo;

	@Column(name = "rentPerDay")
	private double rentPerDay;

	@Column(name = "type")
	private String type;

	@Column(name = "seatCount")
	private int seatCount;

	@Column(name = "airConditioning")
	private boolean airConditioning;

	@Column(name = "start")
	private String start;

	@Column(name = "diskbreak")
	private boolean diskbreak;

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public boolean isAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public boolean isDiskbreak() {
		return diskbreak;
	}

	public void setDiskbreak(boolean diskbreak) {
		this.diskbreak = diskbreak;
	}

}
