package com.rokonoid.airport.apps.dao;

import org.springframework.stereotype.Component;

import com.rokonoid.airport.apps.domain.User;

@Component
public interface UserDao {
	public void create(User user);
}
