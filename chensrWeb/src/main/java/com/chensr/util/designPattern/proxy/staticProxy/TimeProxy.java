package com.chensr.util.designPattern.proxy.staticProxy;

import java.util.Date;

public class TimeProxy implements CommonObject{
    private	CommonObject object ;

 

	public TimeProxy(CommonObject b) {
		this.setObject(b);
	}

    
    @Override
	public void doSomething() {
		System.out.println(new Date());
		object.doSomething();
		System.out.println(new Date());
		
	}
    
	public CommonObject getObject() {
		return object;
	}

	public void setObject(CommonObject object) {
		this.object = object;
	}   
}
