package com.vrs.vrsrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vrs.vrsrest.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, String> {

}
