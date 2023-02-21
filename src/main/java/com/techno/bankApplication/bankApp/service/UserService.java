package com.techno.bankApplication.bankApp.service;

import com.techno.bankApplication.bankApp.model.User;

public interface UserService {

	User addUser(User user);
	boolean removeUser (User user);
	User login(String userName,String passowrd);
}
