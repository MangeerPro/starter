package com.cocky.init.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocky.init.po.User;

/**
 * Default Repository
 */
public interface UserRepository extends JpaRepository<User, Integer> {
   
}

