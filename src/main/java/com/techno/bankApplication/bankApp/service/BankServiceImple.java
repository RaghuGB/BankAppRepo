package com.techno.bankApplication.bankApp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techno.bankApplication.bankApp.dataLayer.BankDataObjects;
import com.techno.bankApplication.bankApp.dataLayer.BankDataObjectsImpl;
import com.techno.bankApplication.bankApp.model.User;

@Component
public class BankServiceImple implements BankService {

	@Autowired
	BankDataObjects bankdata;
	
	public double withdraw(int amount, User user) {
		return bankdata.withdraw(amount, user);
	}

	public double deposit(int amount, User user) {
		
		return bankdata.deposit(amount, user);
	}

	public double showBalance(User user) {
		
		return bankdata.showBalance(user);
	}

}
