package com.cocky.init.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.cocky")
@EnableJpaRepositories("com.cocky.init.dao")
@EntityScan("com.cocky.init.po")
@EnableWebMvc
public class StarterApplication {	

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}
}
