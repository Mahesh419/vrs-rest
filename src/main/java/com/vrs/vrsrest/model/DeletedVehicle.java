package com.vrs.vrsrest.model;

import com.vrs.vrsrest.entity.Vehicle;;

public class DeletedVehicle {
	
	private Vehicle vehicle;
	private int availableSlots;
	
	public DeletedVehicle(Vehicle vehicle, int availableSlots) {
		this.availableSlots = availableSlots;
		this.vehicle = vehicle;
	}
	
	public DeletedVehicle() {
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getAvailableSlots() {
		return availableSlots;
	}
	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}
	
	

}
