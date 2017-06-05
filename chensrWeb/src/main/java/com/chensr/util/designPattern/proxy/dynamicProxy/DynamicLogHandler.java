package com.chensr.util.designPattern.proxy.dynamicProxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicLogHandler implements InvocationHandler {
	private Object object;
	public DynamicLogHandler(Object object){
		this.object=object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("开始日志");
		Object result = method.invoke(object, args);
		return result;
	}
}
