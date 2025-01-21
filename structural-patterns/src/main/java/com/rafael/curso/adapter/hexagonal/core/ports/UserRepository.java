package com.rafael.curso.adapter.hexagonal.core.ports;

import com.rafael.curso.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
