package com.chensr.util.designPattern.proxy.dynamicProxy;

public class Car {
	public void running(){
		System.out.println("开着汽车...");
	}
	public void doSomething(String things){
		System.out.println("开着汽车"+things);
	}
}
