package com.cocky.init.service;

import java.math.BigDecimal;

import com.cocky.init.po.Balance;

public interface BalanceService {
	
	Balance queryByName(String name);

	Integer update(String inName, String outName, BigDecimal transferAmount);
}
