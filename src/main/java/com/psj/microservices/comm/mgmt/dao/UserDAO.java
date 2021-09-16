package com.psj.microservices.comm.mgmt.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psj.microservices.comm.mgmt.entity.Tenament;
import com.psj.microservices.comm.mgmt.entity.User;

public interface UserDAO extends JpaRepository<User, Long> {
	
	
	Optional<User> findByTenament_TenamentId(long tenamentId);

}
