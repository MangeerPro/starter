package com.cocky.init.service;

import com.cocky.init.dao.UserRepository;
import com.cocky.init.po.User;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    private UserRepository repository;

    public void getUsers() {
        Iterable<User> users = repository.findAll();
        users.forEach(
            user -> {
                System.out.println(user.toString());
            }
        );
    }
}
