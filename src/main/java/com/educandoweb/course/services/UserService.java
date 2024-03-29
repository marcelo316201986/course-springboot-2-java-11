package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<OrderItem> findAll() {
		return repository.findAll();

	}

	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

}