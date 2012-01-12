package com.rokonoid.airport.apps.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rokonoid.airport.apps.dao.UserDao;
import com.rokonoid.airport.apps.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(User user) {
		if (user != null) {
			sessionFactory.getCurrentSession().save(user);
		}
	}
}
