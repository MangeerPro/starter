package com.cocky.init.contoller;

import java.math.BigDecimal;

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
	
	@RequestMapping("/transfer")
	public Integer tansfer(@RequestParam(name="inName", defaultValue="A")String inName, 
			@RequestParam(name="outName", defaultValue="B") String outName,
			@RequestParam(name="transferAmout", defaultValue="50")BigDecimal transferAmount) {
		return bService.update(inName, outName, transferAmount);
	}
}
