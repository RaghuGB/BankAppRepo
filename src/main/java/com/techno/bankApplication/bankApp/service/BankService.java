package com.techno.bankApplication.bankApp.service;

import com.techno.bankApplication.bankApp.model.User;

public interface BankService {
	
	double withdraw(int amount,User user);
	double deposit(int amount,User user);
	double showBalance(User user);
}
