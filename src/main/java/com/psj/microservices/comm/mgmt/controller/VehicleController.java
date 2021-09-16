package com.psj.microservices.comm.mgmt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.psj.microservices.comm.mgmt.dao.VehicleDAO;
import com.psj.microservices.comm.mgmt.entity.Vehicle;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleDAO vehicleDAO;
	
	@GetMapping("/vehicle/{vehicleNumber}")
	private Optional<Vehicle> getUser(@PathVariable String vehicleNumber) {
		System.out.println("Vehicle NUMBER"+vehicleNumber);
		return vehicleDAO.findByVehicleNumber(vehicleNumber);
	}

}
