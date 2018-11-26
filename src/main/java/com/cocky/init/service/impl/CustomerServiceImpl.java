package com.cocky.init.service.impl;

import java.util.List;

import com.cocky.init.dao.CustomerRepository;
import com.cocky.init.po.Customer;
import com.cocky.init.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> query() {
        return (List<Customer>) customerRepository.findAll();
    }

	@Override
	public Page<Customer> findallPage(Pageable pageable) {
		return customerRepository.findAll(pageable);
	}

    
}