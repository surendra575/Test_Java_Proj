package com.surendra.service;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.surendra.utils.DateUtils;

@Service
public class UserService {
	public UserService() {
		System.out.println("**********UserService class constructor******");
	}
	@Bean
	public DateUtils getDate()
	{
		return new DateUtils();
	}

}
