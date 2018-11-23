package com.cocky.init.dao;

import java.util.Optional;

import com.cocky.init.po.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    
}

