package com.cocky.init.service;

import java.util.List;

import com.cocky.init.po.User;

/**
 * UserService
 */
public interface UserService {

    public User add(User user);

    public List<User> getUsers();
    
}