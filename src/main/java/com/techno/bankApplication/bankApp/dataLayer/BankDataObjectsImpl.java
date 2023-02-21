package com.techno.bankApplication.bankApp.dataLayer;
import org.springframework.stereotype.Component;

import com.techno.bankApplication.bankApp.model.User;

@Component
public class BankDataObjectsImpl implements BankDataObjects{

	
	public double withdraw(int amount, User user) 
	{
		 if(user.getBalance()<amount+amount*0.045)
	        {
	        	System.out.println("insufficient balance: ");//
	        	return amount;
	        }
		user.setBalance(user.getBalance()-amount+amount*0.045);
		System.out.println(amount+" withdrawl successfully...");
		System.out.println("available balance is: "+user.getBalance());
		return amount;
	}

	public double deposit(int amount, User user) {
		System.out.println("deposited successfully ");//
          user.setBalance(user.getBalance()+amount-amount*0.032);
		
		System.out.println("available balance is: "+user.getBalance());
		return amount;
	}

	public double showBalance(User user) {
		return user.getBalance();
	}

}
