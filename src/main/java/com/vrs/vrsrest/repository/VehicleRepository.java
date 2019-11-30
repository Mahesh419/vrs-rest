package com.vrs.vrsrest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vrs.vrsrest.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
	 public List<Vehicle> findAllByOrderByMake();
}
