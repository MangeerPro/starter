package com.cocky.init.contoller;

import com.cocky.init.po.User;
import com.cocky.init.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("query")
    public List<User> query() {
        return userService.getUsers();
    }

    @RequestMapping("add")
    public User add(User user) {
        return userService.add(user);
    }

}
