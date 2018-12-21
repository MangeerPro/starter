package com.cocky.init.service.impl;

import com.cocky.init.dao.UserRepository;
import com.cocky.init.po.User;
import com.cocky.init.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserService
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository repository;

    @Override
    public Iterable<User> getUsers() {
        Iterable<User> users = repository.findAll();
        return users;
    }

    @Override
    public User add(User user) {
        if (user == null) {
            return null;
        }
        return repository.save(user);
    }
}
