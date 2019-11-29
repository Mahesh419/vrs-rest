package com.vrs.vrsrest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/vehicle", produces = "application/json")
	@ResponseBody
	public ArrayList<Vehicle> getAllVehicle() {		
		return vehicleService.getAllVehicles();
	}
}
