package com.psj.microservices.comm.mgmt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.psj.microservices.comm.mgmt.dao.TenamentDAO;
import com.psj.microservices.comm.mgmt.entity.Tenament;
import com.psj.microservices.comm.mgmt.entity.Vehicle;

@RestController
public class TenamentController {
	
	@Autowired
	private TenamentDAO tenamentDAO;
	
	@GetMapping("/tenament/{tenamentId}")
	private Optional<Tenament> getTenament(@PathVariable long tenamentId) {
		
		return tenamentDAO.findByTenamentId(tenamentId);
	}
	
	@GetMapping("/tenament/vehicle/{vehicleNumber}")
	private Optional<Tenament> getUser(@PathVariable String vehicleNumber) {
		System.out.println("Vehicle NUMBER"+vehicleNumber);
		return tenamentDAO.findByVehicles_VehicleNumber(vehicleNumber);
	}


}
