package com.techno.bankApplication.bankApp.dataLayer;
import com.techno.bankApplication.bankApp.model.User;
public interface BankDataObjects {
	double withdraw(int amount,User user);
	double deposit(int amount,User user);
	double showBalance(User user);
}


