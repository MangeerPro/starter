package com.cocky.init.service;

import com.cocky.init.dao.UserRepository;
import com.cocky.init.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserService
 */
@Service
public class UserService {

    @Resource
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
