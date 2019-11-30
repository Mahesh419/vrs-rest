package com.vrs.vrsrest.service;

import java.util.ArrayList;

import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.model.DeletedVehicle;

public interface VehicleService {
	
	public ArrayList<Vehicle> getAllVehicles();
	
	public Vehicle createNewVehicle(Vehicle vehicle);
	
	public DeletedVehicle deleteVehicle(Long id);

}
