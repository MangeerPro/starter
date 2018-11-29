package com.cocky.init.contoller;

import java.util.List;

import com.cocky.init.po.User;
import com.cocky.init.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = 
                    LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("query")
    public List<User> query() {
        List<User> users = userService.getUsers();
        return users;
    }

    @RequestMapping("add")
    public User add(User user) {
        return userService.add(user);
    }

}
