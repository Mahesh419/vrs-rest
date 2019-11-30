package com.vrs.vrsrest.service;

import java.util.List;

import com.vrs.vrsrest.entity.Car;
import com.vrs.vrsrest.entity.MotorBike;
import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.model.DeletedVehicle;

public interface VehicleService {
	
	public List<Vehicle> getAllVehicles();
	
	public Vehicle createNewVehicle(Vehicle vehicle);
	
	public Car createNewCar(Car vehicle);
	
	public MotorBike createNewMotorBike(MotorBike vehicle);
	
	public DeletedVehicle deleteVehicle(Long id);

}
