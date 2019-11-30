package com.vrs.vrsrest.model;

public class Vehicle {
	
	private String plateNo;
	private String make;
	private String driver;
	private String contactNo;
	private double rentPerDay;
	
	public Vehicle(String plateNo, String make, String driver, String contactNo, double rentPerDay) {
		super();
		this.plateNo = plateNo;
		this.make = make;
		this.driver = driver;
		this.contactNo = contactNo;
		this.rentPerDay = rentPerDay;
	}
	
	public Vehicle() {
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
	
}
