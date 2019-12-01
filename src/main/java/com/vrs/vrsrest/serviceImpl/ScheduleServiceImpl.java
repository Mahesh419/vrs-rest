package com.vrs.vrsrest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrs.vrsrest.entity.Schedule;
import com.vrs.vrsrest.repository.ScheduleRepository;
import com.vrs.vrsrest.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleRepository scheduleRepository;

	@Override
	public Schedule createSchedule(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public List<Schedule> getAllSchedules() {
		return (List<Schedule>) scheduleRepository.findAll();
	}

}
