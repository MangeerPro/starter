package com.cocky.init.contoller;

import com.cocky.init.po.Customer;
import com.cocky.init.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerContoller
 */
@RestController
@RequestMapping("/customer")
public class CustomerContoller {

    @Autowired
    private CustomerService customerService;

    @ResponseBody
    @RequestMapping("query")
    public Page<Customer> query(@RequestParam(value = "page", defaultValue = "0")Integer page,
            @RequestParam(value = "size", defaultValue = "15")Integer size) {
        Sort sort = new Sort(Direction.DESC, "id");        
        Pageable pageable = new PageRequest(page, size, sort);
        return customerService.findallPage(pageable);
    }
    
}