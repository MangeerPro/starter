package com.cocky.init.service;

import com.cocky.init.po.User;

/**
 * UserService
 */
public interface UserService {

    public User add(User user);

    public Iterable<User> getUsers();
    
}