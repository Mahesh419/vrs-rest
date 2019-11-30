package com.vrs.vrsrest.model;

import java.time.LocalDate;

public class Schedule {
	
	private LocalDate pickUpDate;
	private LocalDate dropOffDate;
	
	public Schedule(LocalDate pickUpDate, LocalDate dropOffDate) {
		this.pickUpDate = pickUpDate;
		this.dropOffDate = dropOffDate;
	}
	
	public Schedule() {		
	}	
	
	public LocalDate getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(LocalDate pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public LocalDate getDropOffDate() {
		return dropOffDate;
	}
	public void setDropOffDate(LocalDate dropOffDate) {
		this.dropOffDate = dropOffDate;
	}
	
	

}
