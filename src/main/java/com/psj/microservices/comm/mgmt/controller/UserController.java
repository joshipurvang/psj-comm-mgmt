package com.psj.microservices.comm.mgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.psj.microservices.comm.mgmt.dao.UserDAO;
import com.psj.microservices.comm.mgmt.entity.Tenament;
import com.psj.microservices.comm.mgmt.entity.User;

@RestController
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/user/tenament/{tenamentId}")
	private Optional<User> getUser(@PathVariable long tenamentId) {
		Tenament tenament=new Tenament();
		//tenament.setTenamentId(tenamentId);
		return userDAO.findByTenament_TenamentId(tenamentId);
	}

}
