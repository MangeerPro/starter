package com.cocky.init.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cocky.init.po.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Balance b set b.balance = :transferAmount where b.name = :name ")
	Integer update(String name, BigDecimal transferAmount);

	@Query(value = "select b.* from balance b where b.name = :name for update", nativeQuery = true)
	Balance getBalance(String name);
}
