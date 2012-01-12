package com.rokonoid.airport.apps.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rokonoid.airport.apps.domain.User;

public class DummyUser {
	public List<User> getAllUser() {
		return new ArrayList<User>() {
			private static final long serialVersionUID = 1L;

			{
				add(new User() {
					{
						setUserName("rokon1");
						setPassword("rokonoid");
						setId(1);
						setAdmin(false);
						setFullName("Bazlur Rahman");
						setCreatedDate(new Date());
						setPhoneNumber("2820384");
					}
				});
				add(new User() {
					{
						setUserName("rokon2");
						setPassword("rokonoid");
						setId(1);
						setAdmin(false);
						setFullName("Bazlur Rahman");
						setCreatedDate(new Date());
						setPhoneNumber("2820384");
					}
				});
				add(new User() {
					{
						setUserName("rokon3");
						setPassword("rokonoid");
						setId(1);
						setAdmin(false);
						setFullName("Bazlur Rahman");
						setCreatedDate(new Date());
						setPhoneNumber("2820384");
					}
				});
			}
		};
	}
}
