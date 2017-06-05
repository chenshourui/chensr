package com.chensr.util.designPattern.proxy.staticProxy;

public class LogProxy  implements People {
	private People people;
	
	public LogProxy(People people){
		this.people=people;
	}
	
	@Override
	public void code() {
		System.out.println("logging start");
		people.code();
		System.out.println("logging end");
	}
	
}
