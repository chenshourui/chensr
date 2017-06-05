package com.chensr.util.designPattern.proxy.staticProxy;

public class TimeProxy implements People {
	private People people;
	
	public TimeProxy(People people){
		this.people=people;
	}

	@Override
	public void code() {
		System.out.println("time start");
		people.code();
		System.out.println("time end");
	}
}
