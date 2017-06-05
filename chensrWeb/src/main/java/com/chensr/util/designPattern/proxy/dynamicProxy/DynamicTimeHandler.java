package com.chensr.util.designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicTimeHandler implements InvocationHandler {
	//目标对象
	private Object object;
	public DynamicTimeHandler(Object object){
		this.object=object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {	
		System.out.println("开始时间");
		Object result = method.invoke(object, args);
		return result;
	}
}
