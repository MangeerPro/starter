package com.cocky.init.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocky.init.po.Customer;
/**
 * CustomRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}