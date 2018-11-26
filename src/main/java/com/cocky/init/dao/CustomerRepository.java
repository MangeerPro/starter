package com.cocky.init.dao;

import com.cocky.init.po.Customer;

import org.springframework.data.repository.PagingAndSortingRepository;
/**
 * CustomRepository
 */
public interface CustomerRepository extends PagingAndSortingRepository <Customer, Long>{

}