package com.cocky.init.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cocky.init.po.Balance;
import com.cocky.init.service.BalanceService;

@RequestMapping("/balance")
@RestController
public class BalanceController {

	@Autowired
	private BalanceService bService;
	
	@RequestMapping("/queryBalance")
	public Balance queryBalance(@RequestParam(name="name", defaultValue="A")String name) {
		return bService.queryByName(name);
	}
	
}
