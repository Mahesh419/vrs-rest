package com.vrs.vrsrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vrs.vrsrest.entity.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}
