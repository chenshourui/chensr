package com.chensr.util.designPattern.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		CommonObject object = new People();
		LogProxy logProxy = new LogProxy(object);
		
		TimeProxy timeProxy = new TimeProxy(logProxy);
		
		timeProxy.doSomething();
	}
}
