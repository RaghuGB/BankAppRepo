package com.techno.bankApplication.bankApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.techno.bankApplication.bankApp.dataLayer.UserDataObjects;
import com.techno.bankApplication.bankApp.model.User;

@Component
public class UserServiceImple implements UserService {

	@Autowired
	UserDataObjects userData;
	
	public User addUser(User user) {
		
		return userData.addUser(user);
	}

	public boolean removeUser(User user) {
	
		return userData.removeUser(user);
	}

	public User login(String userName, String passowrd) {
		
		return userData.login(userName, passowrd);
	}

}
