package com.cocky.init.service;

import com.cocky.init.po.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

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