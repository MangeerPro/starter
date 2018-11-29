package com.cocky.init.service;

import java.math.BigDecimal;

import com.cocky.init.po.Balance;

public interface BalanceService {
	
	//public Balance add(String name, BigDecimal transferAmount);
	
	public Balance queryByName(String name);
}
