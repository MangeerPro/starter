package com.cocky.init.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cocky.init.po.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Integer> {
	
/*	@Modifying
	@Transactional
	@Query("update balance b set b.balance = :transferAmount where b.name = :name ")
	Balance update(String name, BigDecimal transferAmount);
	*/
	
}
