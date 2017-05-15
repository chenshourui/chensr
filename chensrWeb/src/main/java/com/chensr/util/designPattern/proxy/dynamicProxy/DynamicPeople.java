package com.chensr.util.designPattern.proxy.dynamicProxy;

import java.util.Random;

import com.chensr.util.designPattern.proxy.dynamicProxy.DynamicCommonObject;

@SuppressWarnings("static-access")
public class DynamicPeople implements DynamicCommonObject {

	@Override
	public void doSomething() {
		System.out.println("eating");
		try {
			Thread.currentThread().sleep(new Random().nextInt(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void eating(String food) {
		System.out.println("eating:"+food);
		
	}

}
