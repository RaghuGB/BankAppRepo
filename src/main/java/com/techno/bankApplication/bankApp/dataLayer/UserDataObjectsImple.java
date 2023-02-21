package com.techno.bankApplication.bankApp.dataLayer;

import org.springframework.stereotype.Component;

import com.techno.bankApplication.bankApp.model.Bank;
import com.techno.bankApplication.bankApp.model.User;

@Component
public class UserDataObjectsImple implements UserDataObjects {

	public User addUser(User user) {
		Bank.getUsers().add(user);
		return user;
	}

	public boolean removeUser(User user) {
	
		return Bank.getUsers().remove(user);
	}

	public User login(String userName, String password)
	{
		       for (User user : Bank.getUsers()) {
		    	   if(user.getUsername().equals(userName)&&user.getPassword().equals(password))
		    		   return user;
			}
		return null;
	}

}
