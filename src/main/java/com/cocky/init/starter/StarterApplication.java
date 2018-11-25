package com.cocky.init.starter;

import com.cocky.init.service.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cocky")
public class StarterApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StarterApplication.class, args);
		UserService uService = applicationContext.getBean(UserService.class);
		uService.getUsers();
	}
}
