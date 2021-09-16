package com.psj.microservices.comm.mgmt.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psj.microservices.comm.mgmt.entity.Tenament;
import com.psj.microservices.comm.mgmt.entity.User;
import com.psj.microservices.comm.mgmt.entity.Vehicle;

public interface VehicleDAO extends JpaRepository<Vehicle, Long> {
	
	
	Optional<Vehicle> findByVehicleNumber(String vehicleNumber);

}
