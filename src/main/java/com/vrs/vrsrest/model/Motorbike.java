package com.vrs.vrsrest.model;

public class Motorbike extends Vehicle {
	
	private String starting; //kick, electric
	private boolean diskBreak;
	
	public Motorbike() {	
	}
	
	public Motorbike(String plateNo, String make, String driver, String contactNo, double rentPerDay, String starting,
			boolean diskBreak) {
		super(plateNo, make, driver, contactNo, rentPerDay);
		this.starting = starting;
		this.diskBreak = diskBreak;
	}
	
	public String getStarting() {
		return starting;
	}
	public void setStarting(String starting) {
		this.starting = starting;
	}
	public boolean isDiskBreak() {
		return diskBreak;
	}
	public void setDiskBreak(boolean diskBreak) {
		this.diskBreak = diskBreak;
	}
	
	

}
