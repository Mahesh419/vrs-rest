package com.vrs.vrsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vrs.vrsrest.entity.Schedule;
import com.vrs.vrsrest.entity.Vehicle;
import com.vrs.vrsrest.service.ScheduleService;

@Controller
public class ScheduleController {
	
	@Autowired
	public ScheduleService scheduleService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/schedule", produces = "application/json")
	@ResponseBody
	public List<Schedule> getAllVehicle() {		
		return scheduleService.getAllSchedules();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/schedule/create", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Schedule addNewVehicle(@RequestBody Schedule schedule) {
		return scheduleService.createSchedule(schedule);
	}

}
