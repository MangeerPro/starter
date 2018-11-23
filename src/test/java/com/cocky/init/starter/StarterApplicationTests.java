package com.cocky.init.starter;

import com.cocky.init.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {StarterApplication.class})
public class StarterApplicationTests {

	@Autowired
	private UserService uService;
	
	@Test
	public void test() {
		uService.getUsers();
	}

}