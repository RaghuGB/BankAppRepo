package com.techno.bankApplication.bankApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techno.bankApplication.bankApp.dataLayer.BankDataObjects;
import com.techno.bankApplication.bankApp.dataLayer.BankDataObjectsImpl;
import com.techno.bankApplication.bankApp.dataLayer.UserDataObjects;
import com.techno.bankApplication.bankApp.dataLayer.UserDataObjectsImple;
import com.techno.bankApplication.bankApp.service.BankService;
import com.techno.bankApplication.bankApp.service.BankServiceImple;
import com.techno.bankApplication.bankApp.service.UserService;
import com.techno.bankApplication.bankApp.service.UserServiceImple;

@Configuration
public class BankConfig {

	@Bean
	public  UserService userServiceBean()
	 {
		 return new UserServiceImple();
	 }
	@Bean
	public  BankService bankServiceBean()
	 {
		 return new BankServiceImple();
	 }
	 @Bean
	public BankDataObjects bankDataObjectsBean()
	{
		return new BankDataObjectsImpl();
	}
	 @Bean
	public UserDataObjects userDataObjectsBean()
	{
		return new UserDataObjectsImple();
	}
	 @Bean
    public App appBean()
    {
    	return new App();
    }
}
