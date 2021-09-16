package com.psj.microservices.comm.mgmt.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psj.microservices.comm.mgmt.entity.Tenament;
import com.psj.microservices.comm.mgmt.entity.User;

public interface TenamentDAO extends JpaRepository<Tenament, Long> {
	
	
	Optional<Tenament> findByTenamentId(long tenamentId);
	Optional<Tenament> findByVehicles_VehicleNumber(String vehicleNumber);

}
