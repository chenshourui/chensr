package com.chensr.util.designPattern.proxy.dynamicProxy;



public class DynamicClient {
	public static void main(String[] args) {
		Car car = new Car();
		Car newCar= (Car) new CglibDynamicProxy(car).getProxyInstance();
		newCar.doSomething("看美女");
		newCar.running();
	}	
}
