package com.cocky.init.dao;

import com.cocky.init.po.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    
}

