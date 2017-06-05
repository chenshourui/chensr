package com.chensr.util.designPattern.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		People p = new Programmer();
		TimeProxy timpProxty = new TimeProxy(p);
		
		LogProxy logProxty = new LogProxy(timpProxty);
		logProxty.code();	
	}
}
