package com.techno.bankApplication.bankApp.dataLayer;

import com.techno.bankApplication.bankApp.model.User;

public interface UserDataObjects {


	User addUser(User user);
	boolean removeUser (User user);
	User login(String userName,String passowrd);
}
