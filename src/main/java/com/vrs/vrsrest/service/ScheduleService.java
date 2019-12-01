package com.vrs.vrsrest.service;

import java.util.List;

import com.vrs.vrsrest.entity.Schedule;

public interface ScheduleService {

	public Schedule createSchedule(Schedule schedule);
	
	public List<Schedule> getAllSchedules();
}
