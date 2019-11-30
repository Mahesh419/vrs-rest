package com.vrs.vrsrest.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.vrs.vrsrest.entity.Vehicle;

@Transactional
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
	List<Vehicle> findAllByOrderByMake();
}
