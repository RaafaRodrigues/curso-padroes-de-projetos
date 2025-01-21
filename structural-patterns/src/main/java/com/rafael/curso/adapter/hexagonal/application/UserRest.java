package com.rafael.curso.adapter.hexagonal.application;

import com.rafael.curso.adapter.hexagonal.core.model.User;
import com.rafael.curso.adapter.hexagonal.core.ports.UserRepository;
import com.rafael.curso.adapter.hexagonal.core.usecases.UserService;
import com.rafael.curso.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {
	private UserService userFacade;
	
	public UserRest() {
		UserRepository userRepo = new UserMemoryDatabaseAdapter();
		userFacade = new UserService(userRepo);
	}

	public Integer post(Map<String, String> values) {
		try { 
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userFacade.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}
	
	public Integer get() {
		List<User> users = userFacade.getUsers();
		users.forEach(System.out::println);
		return 200;
	}
}
