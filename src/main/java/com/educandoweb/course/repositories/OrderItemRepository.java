package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface OrderItemRepository extends JpaRepository<User, Long> {

	
	
}
