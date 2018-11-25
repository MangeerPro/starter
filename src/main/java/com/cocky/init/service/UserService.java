package com.cocky.init.service;

import java.util.List;

import com.cocky.init.dao.UserRepository;
import com.cocky.init.po.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers() {
        Iterable<User> users = repository.findAll();
        return (List<User>) users;
    }

    public User add(User user) {
        if (user == null) {
            return null;
        }
        return repository.save(user);
    }
}
