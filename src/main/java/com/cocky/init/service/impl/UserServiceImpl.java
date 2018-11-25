package com.cocky.init.service.impl;

import java.util.List;

import com.cocky.init.dao.UserRepository;
import com.cocky.init.po.User;
import com.cocky.init.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getUsers() {
        Iterable<User> users = repository.findAll();
        return (List<User>) users;
    }

    @Override
    public User add(User user) {
        if (user == null) {
            return null;
        }
        return repository.save(user);
    }
}
