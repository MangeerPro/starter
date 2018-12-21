package com.cocky.init.service;

import com.cocky.init.starter.StarterApplication;
import com.google.common.base.Stopwatch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {StarterApplication.class})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void userServiceTest() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        userService.getUsers();
        stopwatch.stop();
        System.out.println(stopwatch.elapsed());
    }
}

