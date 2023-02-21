package com.techno.bankApplication.bankApp;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.techno.bankApplication.bankApp.model.User;
import com.techno.bankApplication.bankApp.service.BankService;
import com.techno.bankApplication.bankApp.service.UserService;

@Component

public class App {
	
	@Autowired
	private UserService userService;
	@Autowired
	private BankService bankService;

	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public BankService getBankService() {
		return bankService;
	}

	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}

	void bankOperations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank APP");
		System.out.println("enter \n 1.Admin \n 2.Users ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter user name and password of admin: ");
			if (sc.next().equals("admin") && sc.next().equals("girish")) {
				System.out.println("1.add users \n 2. delete users");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("enter the username, password and balance");
					User user = new User();
					user.setUsername(sc.next());
					user.setPassword(sc.next());
					user.setBalance(sc.nextDouble());
					userService.addUser(user);
					System.out.println("added sucessfully");
					break;
				}
			} else {
				System.out.println("invalid user name and password");
			}
			break;
		case 2:
			System.out.println("Welcome User:-");
			System.out.println("Enter UserName and Password");
			User user = userService.login(sc.next(), sc.next());
			if (user == null) {
				System.out.println("login faild..");

			} else {
				System.out.println("\n 1.withdrawl 2.deposit 3.balance check");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("enter the amount to withdrawl");
					int amount = sc.nextInt();
					bankService.withdraw(amount, user);
					break;
				case 2:
					System.out.println("enter the amount to deposit");
					amount = sc.nextInt();
					bankService.deposit(amount, user);
					break;
				case 3:
					System.out.println(bankService.showBalance(user));
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ap = new AnnotationConfigApplicationContext(BankConfig.class);
		App a1 = (App) ap.getBean(App.class);
		/*
		 * System.out.println(a1.getBankService());
		 * System.out.println(a1.getBankService());
		 */
		while (true) {
			a1.bankOperations();
			System.out.println("do you want to continue..");
			if (sc.next().equalsIgnoreCase("no"))
				break;
		}

	}
}