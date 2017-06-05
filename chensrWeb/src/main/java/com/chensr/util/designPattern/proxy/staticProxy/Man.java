package com.chensr.util.designPattern.proxy.staticProxy;

import java.util.Random;

@SuppressWarnings("static-access")
public class Man implements CommonObject {

	@Override
	public void doSomething() {
		System.out.println("I am running");
		try {
			Thread.currentThread().sleep(new Random().nextInt(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
