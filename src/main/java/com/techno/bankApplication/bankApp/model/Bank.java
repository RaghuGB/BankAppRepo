package com.techno.bankApplication.bankApp.model;
import java.util.HashSet;
import java.util.Set;
public class Bank {
static Set<User> users=new HashSet<User>();

public static Set<User> getUsers() {
	return users;
}
}
