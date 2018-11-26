package com.cocky.init.service;

import java.util.List;

import com.cocky.init.po.Customer;

import org.springframework.data.domain.Page;

/**
 * CustomerService
 */
public interface CustomerService {
 
    /**
     *  查询全部
     * @return
     */
    public List<Customer> query();
    
    public Page<Customer> findallPage(Pageable pageable);

}