package com.vrs.vrsrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vrs.vrsrest.entity.Car;
import com.vrs.vrsrest.entity.MotorBike;
import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.model.DeletedVehicle;
import com.vrs.vrsrest.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
		
	@RequestMapping(method = RequestMethod.GET, value = "/vehicle", produces = "application/json")
	@ResponseBody
	public List<Vehicle> getAllVehicle() {		
		return vehicleService.getAllVehicles();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/vehicle/create", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Vehicle addNewVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.createNewVehicle(vehicle);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/vehicle/car/create", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Car addNewVehicle(@RequestBody Car vehicle) {
		return vehicleService.createNewCar(vehicle);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/vehicle/bike/create", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public MotorBike addNewVehicle(@RequestBody MotorBike vehicle) {
		return vehicleService.createNewMotorBike(vehicle);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/vehicle/delete", produces = "application/json")
	@ResponseBody
	public DeletedVehicle deleteVehicle(@RequestParam long id) {
		return vehicleService.deleteVehicle(id);
	}
}
