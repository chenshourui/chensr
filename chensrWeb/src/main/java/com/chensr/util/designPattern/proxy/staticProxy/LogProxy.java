package com.chensr.util.designPattern.proxy.staticProxy;

public class LogProxy implements CommonObject {
	
	private CommonObject object;
	public LogProxy(CommonObject object) {
		this.setObject(object);
		
	}

	@Override
	public void doSomething() {
		System.out.println("Logging start");
		object.doSomething();
		System.out.println("Logging end");
	}

	public CommonObject getObject() {
		return object;
	}

	public void setObject(CommonObject object) {
		this.object = object;
	}
	
}
