package com.chensr.util.designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy {
	public Object object;
	public InvocationHandler h;
	
	public JdkDynamicProxy(Object object,InvocationHandler h){
		this.object=object;
		this.h = h ;
	}

	//获取一个代理
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(
				object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), 
				h);
	}
}
