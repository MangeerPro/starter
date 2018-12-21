package com.cocky.init.dao;

import com.cocky.init.service.CommonInterface;
/**
 * Test for Interface Method
 * @author haohao
 *
 */
public class CommonInterfaceImpl implements CommonInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		CommonInterface.say();
		new CommonInterfaceImpl().pay();
	}
}
