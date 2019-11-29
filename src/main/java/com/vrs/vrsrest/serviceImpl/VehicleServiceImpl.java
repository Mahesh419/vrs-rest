package com.vrs.vrsrest.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.repository.VehicleRepository;
import com.vrs.vrsrest.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public ArrayList<Vehicle> getAllVehicles() {
		
		return null;
	}

}
