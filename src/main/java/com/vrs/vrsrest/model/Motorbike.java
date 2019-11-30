package com.vrs.vrsrest.model;

public class Motorbike extends Vehicle {
	
	private String start; //kick, electric
	private boolean diskBreak;
	
	public Motorbike() {	
	}
	
	public Motorbike(String plateNo, String make, String driver, String contactNo, double rentPerDay, String starting,
			boolean diskBreak) {
		super(plateNo, make, driver, contactNo, rentPerDay);
		this.start = starting;
		this.diskBreak = diskBreak;
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public boolean isDiskBreak() {
		return diskBreak;
	}
	public void setDiskBreak(boolean diskBreak) {
		this.diskBreak = diskBreak;
	}
	
	

}
