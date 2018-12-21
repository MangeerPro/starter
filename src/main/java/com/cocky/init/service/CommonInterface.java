package com.cocky.init.service;


public interface CommonInterface {

	static void say() {
		System.out.println("static");
	}
	void test();
	
	default void pay() {
		System.out.println("pay");
	}
}
