package com.vrs.vrsrest.serviceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.model.DeletedVehicle;
import com.vrs.vrsrest.repository.VehicleRepository;
import com.vrs.vrsrest.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public ArrayList<Vehicle> getAllVehicles() {
		return (ArrayList<Vehicle>) vehicleRepository.findAllByOrderByMake();
	}

	@Override
	public Vehicle createNewVehicle(Vehicle vehicle) {
		if(vehicleRepository.count() <= 50) {
			System.out.println(vehicle);
			return vehicleRepository.save(vehicle);}
		return null;
	}

	@Override
	public DeletedVehicle deleteVehicle(Long id) {
		Optional<Vehicle> vehicle = vehicleRepository.findById(id);
		vehicleRepository.deleteById(id);
		int availableSlots = 50 - (int) vehicleRepository.count();
		DeletedVehicle deletedVehicle = new DeletedVehicle(vehicle.get(), availableSlots);
		return deletedVehicle;
	}

}
