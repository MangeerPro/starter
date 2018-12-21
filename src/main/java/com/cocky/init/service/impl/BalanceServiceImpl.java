package com.cocky.init.service.impl;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cocky.init.dao.BalanceRepository;
import com.cocky.init.po.Balance;
import com.cocky.init.service.BalanceService;

@Service
public class BalanceServiceImpl implements BalanceService {

	@Autowired
	private BalanceRepository balanceRepsitory;
	
	/*
	 * @Override(non-Javadoc)
	 * @see com.cocky.init.service.BalanceService#add(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	@Transactional
	public Integer update(String inName, String outName, BigDecimal transferAmount) {
		BigDecimal outTransferAmount = balanceRepsitory.
				getBalance(inName).getBalance().subtract(transferAmount);
		if(outTransferAmount.compareTo(BigDecimal.ZERO) < 0) {
			return 0;
		}
		BigDecimal inTransferAmount = balanceRepsitory.
				getBalance(outName).getBalance().add(transferAmount);
		balanceRepsitory.update(inName, inTransferAmount);
		return balanceRepsitory.update(outName, transferAmount);
	}
	
	@Override
	public Balance queryByName(String name) {
		Balance balance = new Balance();
		balance.setName(name);
		Example<Balance> ex = Example.of(balance);
		Optional<Balance> bOptional = balanceRepsitory.findOne(ex);
		return bOptional.filter(bal -> {
			return bal != null;
		}).get();
	}
}
