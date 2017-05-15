package com.chensr.util.designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy {
	private DynamicCommonObject object;

	public JdkDynamicProxy(DynamicCommonObject object) {
		this.object = object;
	}
	
	public Object getProxyInstance(){

		return Proxy.newProxyInstance(
				object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), 
				new InvocationHandler() {					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("log start");
						Object result = method.invoke(object, args);
						System.out.println("log end");
						return result;
					}
				}		
			);
	}
	
	
}
